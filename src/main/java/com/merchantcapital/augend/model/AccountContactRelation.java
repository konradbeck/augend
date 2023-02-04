package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
@Table(name = "account_contact_relation")
public class AccountContactRelation extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private Account account;

    @ManyToOne
    @JoinColumn
    private Contact contact;
}