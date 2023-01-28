package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class PaymentCycle extends AbstractAuditable<User, Long> {

    private String cronExpression;

    @ManyToOne
    @JoinColumn
    private LoanAccount loanAccount;
}