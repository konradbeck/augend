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
                .map(offerMapper::fromOffer)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public Optional<OfferDto> findById(Long id) {
        return offerRepository.findById(id).map(offerMapper::fromOffer);
    }

    public OfferDto save(OfferDto offerDto) {
        return offerMapper.fromOffer(offerRepository.save(offerMapper.toOffer(offerDto)));
    }
}
