package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.util.Set;

@Entity
public class Account extends AbstractAuditable<User, Long> {


}