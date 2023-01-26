package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

@Entity
public class Quote extends AbstractAuditable<User, Long> {

    @Column
    private BigDecimal amount;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private BigDecimal term;

    @ManyToOne
    @JoinColumn
    private Offer offer;
}