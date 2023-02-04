package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.util.Set;

@Entity
@Table(name = "transaction_rule")
public class TransactionRule extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private TransactionDefinition transactionDefinition;

    @OneToMany(mappedBy = "transactionRule", orphanRemoval = true)
    private Set<Transaction> transactions;
}
