package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "loan_account_summary", uniqueConstraints = @UniqueConstraint(columnNames = {"loan_account_id", "date"}))
public class LoanAccountSummary extends AbstractAuditable<User, Long> {
    @Column(name = "balance")
    private BigDecimal balance;
    @Column(name = "cumulative_repayment")
    private BigDecimal cumulativeRepayment;
    @Column(name = "cumulative_expected_repayment")
    private BigDecimal cumulativeExpectedRepayment;
    @Column(name = "date")
    private Date date;
    @Column(name = "disbursement")
    private BigDecimal disbursement;
    @Column(name = "fee")
    private BigDecimal fee;
    @ManyToOne
    @JoinColumn
    private LoanAccount loanAccount;
    @Column(name = "payment_efficiency")
    private BigDecimal paymentEfficiency;
    @Column(name = "repayment")
    private BigDecimal repayment;
    @Column(name = "rolling_payment_efficiency")
    private BigDecimal rollingPaymentEfficiency;
    @Column(name = "settlement_balance")
    private BigDecimal settlementBalance;
    @Column(name = "top_up_balance")
    private BigDecimal topUpBalance;
    @Column(name = "write_off")
    private BigDecimal writeOff;
}