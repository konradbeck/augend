package com.merchantcapital.augend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "loan_account_summary")
public class LoanAccountSummary extends AbstractAuditable<User, Long> {

    private BigDecimal balance;

    private BigDecimal cumulativeRepayment;

    private BigDecimal cumulativeExpectedRepayment;

    private Date date;

    private BigDecimal disbursement;

    private BigDecimal fee;

    @ManyToOne
    @JoinColumn
    private LoanAccount loanAccount;

    private BigDecimal paymentEfficiency;

    private BigDecimal repayment;

    private BigDecimal rollingPaymentEfficiency;

    private BigDecimal settlementBalance;

    private BigDecimal topUpBalance;

    private BigDecimal writeOff;
}