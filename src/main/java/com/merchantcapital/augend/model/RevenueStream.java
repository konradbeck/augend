package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.util.Set;

@Entity
public class RevenueStream extends AbstractAuditable<User, Long> {

    private BigDecimal amount;

    @OneToMany(mappedBy = "revenueStream", orphanRemoval = true)
    private Set<ExpectedRevenue> expectedRevenues;

    @ManyToOne
    @JoinColumn
    private Offer offer;

    @ManyToOne
    @JoinColumn
    private PaymentPlan paymentPlan;

    @ManyToOne
    @JoinColumn
    private TransactionAccount transactionAccount;
}