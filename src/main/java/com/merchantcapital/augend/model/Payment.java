package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

@Entity
public class Payment extends AbstractAuditable<User, Long> {

    @Column
    private BigDecimal amount;
}