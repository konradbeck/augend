package com.merchantcapital.augend.service;

import com.merchantcapital.augend.dto.OfferDto;
import com.merchantcapital.augend.mapper.OfferMapper;
import com.merchantcapital.augend.repository.OfferRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class OfferService {

    private final OfferMapper offerMapper = Mappers.getMapper(OfferMapper.class);

    private final OfferRepository offerRepository;

    public List<OfferDto> findAll() {
        return offerRepository.findAll()
                .stream()
                .map(offerMapper::offerToOfferDto)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public Optional<OfferDto> findById(Long id) {
        return offerRepository.findById(id).map(offerMapper::offerToOfferDto);
    }

    public OfferDto save(OfferDto offerDto) {
        return offerMapper.offerToOfferDto(offerRepository.save(offerMapper.offerDtoToOffer(offerDto)));
    }
}