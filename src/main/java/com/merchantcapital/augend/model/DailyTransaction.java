package com.merchantcapital.augend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class DailyTransaction extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private TransactionAccount transactionAccount;
}