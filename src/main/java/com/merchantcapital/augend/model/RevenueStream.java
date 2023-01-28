package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

@Entity
public class RevenueStream extends AbstractAuditable<User, Long> {

    private BigDecimal amount;

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