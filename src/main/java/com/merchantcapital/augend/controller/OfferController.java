package com.merchantcapital.augend.controller;

import com.merchantcapital.augend.dto.OfferDto;
import com.merchantcapital.augend.service.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "offers")
public class OfferController {

    private final OfferService offerService;

    @GetMapping("/{id}")
    Optional<OfferDto> findById(@PathVariable Long id) {
        return offerService.findById(id);
    }

    @GetMapping
    List<OfferDto> findAll() {
        return offerService.findAll();
    }

    @PostMapping
    public OfferDto save(@RequestBody OfferDto offerDto) {
        return offerService.save(offerDto);
    }
}