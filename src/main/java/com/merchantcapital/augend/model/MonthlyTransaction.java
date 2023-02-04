package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

@Entity
@Table(name = "monthly_transaction", uniqueConstraints = @UniqueConstraint(columnNames = {"transaction_account_id", "month", "year"}))
public class MonthlyTransaction extends AbstractAuditable<User, Long> {

    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "month")
    private int month;
    @ManyToOne
    @JoinColumn
    private TransactionAccount transactionAccount;
    @Column(name = "year")
    private int year;
}