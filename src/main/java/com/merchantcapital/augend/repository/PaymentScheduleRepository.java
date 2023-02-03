package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.PaymentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentScheduleRepository extends JpaRepository<PaymentSchedule, Long>, JpaSpecificationExecutor<PaymentSchedule> {

}
