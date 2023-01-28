package com.merchantcapital.augend.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.jpa.domain.AbstractAuditable;

public class TransactionRule extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private TransactionDefinition transactionDefinition;
}
