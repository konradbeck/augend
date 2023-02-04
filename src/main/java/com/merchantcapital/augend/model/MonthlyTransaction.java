package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

@Entity
@Table(name = "monthly_transaction")
public class MonthlyTransaction extends AbstractAuditable<User, Long> {

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn
    private TransactionAccount transactionAccount;
}