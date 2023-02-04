package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table(name = "loan_account")
public class LoanAccount extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private Account account;
    @Column(name = "balance")
    private BigDecimal balance;
    @Column(name = "disbursement")
    private BigDecimal disbursement;
    @Column(name = "fee")
    private BigDecimal fee;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "requested")
    private BigDecimal requested;
    @OneToMany(mappedBy = "loanAccount", orphanRemoval = true)
    private Set<LoanAccountSummary> loanAccountSummaries;
    @Column(name = "start_date")
    private ZonedDateTime startDate;
}