package com.merchantcapital.augend.model;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class MonthlyTransaction extends AbstractAuditable<User, Long> {

}