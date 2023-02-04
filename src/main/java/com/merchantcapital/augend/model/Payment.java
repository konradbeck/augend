package com.merchantcapital.augend.model;

import com.merchantcapital.augend.dto.PaymentStatusDto;
import com.merchantcapital.augend.dto.PaymentTypeDto;
import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "payment")
public class Payment extends AbstractAuditable<User, Long> {

    private BigDecimal amount;

    @ElementCollection(targetClass = PaymentStatusDto.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<PaymentStatusDto> status;

    @ElementCollection(targetClass = PaymentTypeDto.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<PaymentTypeDto> type;
}