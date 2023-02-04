package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
@Table(name = "contact")
public class Contact extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private Account account;
}