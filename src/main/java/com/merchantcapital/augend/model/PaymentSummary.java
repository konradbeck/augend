package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class PaymentSummary extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private PaymentCycle paymentCycle;

    @ManyToOne
    @JoinColumn
    private PaymentPlan paymentPlan;
}