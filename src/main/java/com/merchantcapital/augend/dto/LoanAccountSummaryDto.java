package com.merchantcapital.augend.dto;

import com.merchantcapital.augend.model.LoanAccount;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public record LoanAccountSummaryDto(BigDecimal balance,
                                    BigDecimal cumulativeRepayment,
                                    BigDecimal cumulativeExpectedRepayment,
                                    Date date,
                                    BigDecimal disbursement,
                                    BigDecimal fee,
                                    Long id,
                                    LoanAccount loanAccount,
                                    BigDecimal paymentEfficiency,
                                    BigDecimal repayment,
                                    BigDecimal rollingPaymentEfficiency,
                                    BigDecimal settlementBalance,
                                    BigDecimal topUpBalance,
                                    BigDecimal writeOff) implements Serializable {
}
