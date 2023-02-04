package com.merchantcapital.augend.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public record QuoteDto(BigDecimal averageMonthlyRevenue,
                       Long id) implements Serializable {
}
