package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.time.ZonedDateTime;

@Entity
@Table(name = "payment_summary", uniqueConstraints = @UniqueConstraint(columnNames = {"payment_cycle_id", "date"}))
public class PaymentSummary extends AbstractAuditable<User, Long> {

    private ZonedDateTime date;

    @ManyToOne
    @JoinColumn
    private PaymentCycle paymentCycle;

    @ManyToOne
    @JoinColumn
    private PaymentPlan paymentPlan;
}