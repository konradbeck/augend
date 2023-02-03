package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.PaymentCycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentCycleRepository extends JpaRepository<PaymentCycle, Long>, JpaSpecificationExecutor<PaymentCycle> {

}
