package com.merchantcapital.augend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

@Entity
@Table(name = "expected_revenue")
public class ExpectedRevenue extends AbstractAuditable<User, Long> {

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn
    private RevenueStream revenueStream;
}
