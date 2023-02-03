package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.PaymentPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentPlanRepository extends JpaRepository<PaymentPlan, Long>, JpaSpecificationExecutor<PaymentPlan> {

}
