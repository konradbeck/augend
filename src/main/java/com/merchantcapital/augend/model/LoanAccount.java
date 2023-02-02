package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
public class LoanAccount extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private Account account;

    private BigDecimal balance;

    private BigDecimal disbursement;

    private BigDecimal fee;

    private boolean isActive;

    private BigDecimal requested;

    @OneToMany(mappedBy = "loanAccount", orphanRemoval = true)
    private Set<LoanAccountSummary> loanAccountSummaries;

    private ZonedDateTime startDate;
}