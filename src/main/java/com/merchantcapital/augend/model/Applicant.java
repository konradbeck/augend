package com.merchantcapital.augend.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
@Table(name = "applicant")
public class Applicant extends AbstractAuditable<User, Long> {

    @ManyToOne
    @JoinColumn
    private Contact contact;

    @ManyToOne
    @JoinColumn
    private Offer offer;
}