package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.LoanAccountSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanAccountSummaryRepository extends JpaRepository<LoanAccountSummary, Long>, JpaSpecificationExecutor<LoanAccountSummary> {

}