package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
@Table(name = "payment_plan")
public class PaymentPlan extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private PaymentAccount paymentAccount;

    @ManyToOne
    @JoinColumn
    private PaymentCycle paymentCycle;

    @ManyToOne
    @JoinColumn
    private Quote quote;
}