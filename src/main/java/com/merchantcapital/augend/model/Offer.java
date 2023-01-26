package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Offer extends AbstractAuditable<User, Long> {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private BigDecimal maximumAmount;

    @Column
    private BigDecimal maximumHoldback;

    @Column
    private BigDecimal maximumTerm;

    @Column
    private BigDecimal minimumAmount;

    @Column
    private BigDecimal minimumHoldback;

    @Column
    private BigDecimal minimumTerm;

    @Column
    private BigDecimal monthlyAverageRevenue;

    @OneToMany(mappedBy = "offer", orphanRemoval = true)
    private Set<Quote> quotes = new LinkedHashSet<>();
}