package com.merchantcapital.augend.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;

public class ExpectedRevenue extends AbstractAuditable<User, Long> {

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn
    private RevenueStream revenueStream;
}
