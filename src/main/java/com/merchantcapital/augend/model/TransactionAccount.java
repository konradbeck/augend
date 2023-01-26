package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class TransactionAccount extends AbstractAuditable<User, Long> {

}