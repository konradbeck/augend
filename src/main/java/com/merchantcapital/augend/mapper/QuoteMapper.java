package com.merchantcapital.augend.mapper;

import com.merchantcapital.augend.dto.QuoteDto;
import com.merchantcapital.augend.model.Quote;
import org.mapstruct.Mapper;

@Mapper
public interface QuoteMapper {

    Quote toQuote(QuoteDto quoteDto);

    QuoteDto fromQuote(Quote quote);
}
