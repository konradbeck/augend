package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "offer")
public class Offer extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private Account account;
    @Column(name = "maximum_amount")
    private BigDecimal maximumAmount;
    @Column(name = "maximum_holdback")
    private BigDecimal maximumHoldback;
    @Column(name = "maximum_term")
    private BigDecimal maximumTerm;
    @Column(name = "minimum_amount")
    private BigDecimal minimumAmount;
    @Column(name = "minimum_holdback")
    private BigDecimal minimumHoldback;
    @Column(name = "minimum_term")
    private BigDecimal minimumTerm;
    @Column(name = "monthly_average_revenue")
    private BigDecimal monthlyAverageRevenue;
    @OneToMany(mappedBy = "offer", orphanRemoval = true)
    private Set<Quote> quotes;
}