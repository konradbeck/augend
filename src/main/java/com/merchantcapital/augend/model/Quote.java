package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

@Entity
@Table(name = "quote")
public class Quote extends AbstractAuditable<User, Long> {

    private BigDecimal amount;

    private BigDecimal averageMonthlyRevenue;

    private BigDecimal factorPerMonth;

    @ManyToOne
    @JoinColumn
    private LoanAccount loanAccount;

    private BigDecimal term;

    @ManyToOne
    @JoinColumn
    private Offer offer;

    private BigDecimal total;
}