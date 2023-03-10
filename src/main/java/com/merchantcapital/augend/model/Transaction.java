package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "transaction")
public class Transaction extends AbstractAuditable<User, Long> {

    private BigDecimal amount;

    private ZonedDateTime date;

    @ManyToOne
    @JoinColumn
    private TransactionDefinition transactionDefinition;

    @ManyToOne
    @JoinColumn
    private TransactionRule transactionRule;

    @ManyToOne
    @JoinColumn
    private TransactionAccount transactionAccount;
}