package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.DailyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyTransactionRepository extends JpaRepository<DailyTransaction, Long>, JpaSpecificationExecutor<DailyTransaction> {

}
