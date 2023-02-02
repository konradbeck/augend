package com.merchantcapital.augend.dto;

import com.merchantcapital.augend.model.LoanAccount;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
public class LoanAccountSummaryDto {

    BigDecimal balance;

    BigDecimal cumulativeRepayment;

    BigDecimal cumulativeExpectedRepayment;

    Date date;

    BigDecimal disbursement;

    BigDecimal fee;

    Long id;

    LoanAccount loanAccount;

    BigDecimal paymentEfficiency;

    BigDecimal repayment;

    BigDecimal rollingPaymentEfficiency;

    BigDecimal settlementBalance;

    BigDecimal topUpBalance;

    BigDecimal writeOff;
}
