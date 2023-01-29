package com.merchantcapital.augend.controller;

import com.merchantcapital.augend.dto.OfferDto;
import com.merchantcapital.augend.dto.QuoteDto;
import com.merchantcapital.augend.service.OfferService;
import com.merchantcapital.augend.service.QuoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "quotes")
public class QuoteController {

    private final QuoteService quoteService;

    @GetMapping("{id}")
    Optional<QuoteDto> findById(@PathVariable Long id) {
        return quoteService.findById(id);
    }

    @GetMapping
    List<QuoteDto> findAll() {
        return quoteService.findAll();
    }

    @PostMapping
    public QuoteDto save(@RequestBody QuoteDto quoteDto) {
        return quoteService.save(quoteDto);
    }
}
