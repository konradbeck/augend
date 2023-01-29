package com.merchantcapital.augend.service;

import com.merchantcapital.augend.dto.QuoteDto;
import com.merchantcapital.augend.mapper.QuoteMapper;
import com.merchantcapital.augend.repository.QuoteRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class QuoteService {

    private final QuoteMapper quoteMapper = Mappers.getMapper(QuoteMapper.class);

    private final QuoteRepository quoteRepository;

    public List<QuoteDto> calculate(List<QuoteDto> quoteDtos) {
        return quoteDtos.stream()
                .map(this::setAverageMonthlyRevenue)
                .toList();
    }

    public List<QuoteDto> findAll() {
        return quoteRepository.findAll()
                .stream()
                .map(quoteMapper::quoteToQuoteDto)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public Optional<QuoteDto> findById(Long id) {
        return quoteRepository.findById(id).map(quoteMapper::quoteToQuoteDto);
    }

    public QuoteDto save(QuoteDto quoteDto) {
        return quoteMapper.quoteToQuoteDto(quoteRepository.save(quoteMapper.quoteDtoToQuote(quoteDto)));
    }

    private QuoteDto setAverageMonthlyRevenue(QuoteDto quoteDto) {
        quoteDto.setAverageMonthlyRevenue(BigDecimal.valueOf(100));

        return quoteDto;
    }
}