package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Table(name = "daily_transaction", uniqueConstraints = @UniqueConstraint(columnNames = {"transaction_account_id", "date"}))
public class DailyTransaction extends AbstractAuditable<User, Long> {

    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "date")
    private Date date;
    @ManyToOne
    @JoinColumn
    private TransactionAccount transactionAccount;
}