package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.util.Set;

@Entity
@Table(name = "account")
public class Account extends AbstractAuditable<User, Long> {

    @OneToMany(mappedBy = "account", orphanRemoval = true)
    private Set<TransactionAccount> accountTransactionAccounts;

    @OneToMany(mappedBy = "provider", orphanRemoval = true)
    private Set<TransactionAccount> providerTransactionAccounts;
}