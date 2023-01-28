package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

@Entity
public class LoanAccount extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private Account account;

    private BigDecimal balance;
}