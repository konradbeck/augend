package com.merchantcapital.augend.mapper;

import com.merchantcapital.augend.dto.OfferDto;
import com.merchantcapital.augend.model.Offer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OfferMapper {

    Offer offerDtoToOffer(OfferDto offerDto);

    OfferDto offerToOfferDto(Offer offer);
}