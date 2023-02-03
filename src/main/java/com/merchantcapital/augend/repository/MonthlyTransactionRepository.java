package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.MonthlyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyTransactionRepository extends JpaRepository<MonthlyTransaction, Long>, JpaSpecificationExecutor<MonthlyTransaction> {

}