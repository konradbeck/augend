package com.merchantcapital.augend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

@Entity
public class MonthlyTransaction extends AbstractAuditable<User, Long> {

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn
    private TransactionAccount transactionAccount;
}