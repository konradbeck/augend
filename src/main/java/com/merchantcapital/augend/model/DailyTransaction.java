package com.merchantcapital.augend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.time.ZonedDateTime;

@Entity
@Table(name = "daily_transaction")
public class DailyTransaction extends AbstractAuditable<User, Long> {

    private ZonedDateTime date;

    @ManyToOne
    @JoinColumn
    private TransactionAccount transactionAccount;
}