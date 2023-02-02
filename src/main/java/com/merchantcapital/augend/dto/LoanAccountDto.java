package com.merchantcapital.augend.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class LoanAccountDto {

    private BigDecimal balance;

    private BigDecimal disbursement;

    private BigDecimal fee;

    private boolean isActive;

    private BigDecimal requested;

    private ZonedDateTime startDate;
}
