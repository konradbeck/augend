package com.merchantcapital.augend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="user")
public class User extends AbstractPersistable<Long> {

    private String firstName;

    private String lastName;

    private String email;
}