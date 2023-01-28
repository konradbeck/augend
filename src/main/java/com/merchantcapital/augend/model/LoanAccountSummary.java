package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class LoanAccountSummary extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private LoanAccount loanAccount;
}