package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class PaymentAccount extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private TransactionAccount source;

    @ManyToOne
    @JoinColumn
    private TransactionAccount destination;
}