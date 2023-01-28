package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.util.Set;

@Entity
public class TransactionAccount extends AbstractAuditable<User, Long> {


    @ManyToOne
    @JoinColumn
    private Account account;

    @OneToMany(mappedBy = "transactionAccount", orphanRemoval = true)
    private Set<Transaction> transactions;
}