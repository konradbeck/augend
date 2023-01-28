package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Offer extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private Account account;

    private BigDecimal maximumAmount;

    private BigDecimal maximumHoldback;

    private BigDecimal maximumTerm;

    private BigDecimal minimumAmount;

    private BigDecimal minimumHoldback;

    private BigDecimal minimumTerm;

    private BigDecimal monthlyAverageRevenue;

    @OneToMany(mappedBy = "offer", orphanRemoval = true)
    private Set<Quote> quotes;
}