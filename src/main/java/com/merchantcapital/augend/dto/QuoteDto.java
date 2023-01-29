package com.merchantcapital.augend.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuoteDto {

    BigDecimal averageMonthlyRevenue;

    Long id;
}
