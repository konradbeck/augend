package com.merchantcapital.augend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.util.Set;

@Entity
public class TransactionDefinition extends AbstractAuditable<User, Long> {

//    @OneToMany(mappedBy = "transactionDefinition", orphanRemoval = true)
//    private Set<Transaction> transactions;

//    @OneToMany(mappedBy = "transactionDefinition", orphanRemoval = true)
//    private Set<TransactionRule> transactionRules;
}