package com.merchantcapital.augend.model;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class DailyTransaction extends AbstractAuditable<User, Long> {

}