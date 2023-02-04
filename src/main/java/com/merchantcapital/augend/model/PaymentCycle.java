package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.time.ZonedDateTime;

@Entity
@Table(name = "payment_cycle")
public class PaymentCycle extends AbstractAuditable<User, Long> {

    private String cronExpression;

    private ZonedDateTime endDate;

    @ManyToOne
    @JoinColumn
    private LoanAccount loanAccount;

    private ZonedDateTime startDate;
}