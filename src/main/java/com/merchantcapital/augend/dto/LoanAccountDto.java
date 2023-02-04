package com.merchantcapital.augend.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record LoanAccountDto(BigDecimal balance,
                             BigDecimal disbursement,
                             BigDecimal fee,
                             boolean isActive,
                             BigDecimal requested,
                             ZonedDateTime startDate) implements Serializable {
}
