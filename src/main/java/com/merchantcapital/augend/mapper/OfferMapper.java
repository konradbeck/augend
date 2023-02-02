package com.merchantcapital.augend.mapper;

import com.merchantcapital.augend.dto.OfferDto;
import com.merchantcapital.augend.model.Offer;
import org.mapstruct.Mapper;

@Mapper
public interface OfferMapper {

    Offer toOffer(OfferDto offerDto);

    OfferDto fromOffer(Offer offer);
}