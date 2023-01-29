package com.merchantcapital.augend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.util.Set;

@Entity
public class TransactionRule extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private TransactionDefinition transactionDefinition;

    @OneToMany(mappedBy = "transactionRule", orphanRemoval = true)
    private Set<Transaction> transactions;
}
