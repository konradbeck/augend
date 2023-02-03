package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.LoanAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanAccountRepository extends JpaRepository<LoanAccount, Long>, JpaSpecificationExecutor<LoanAccount> {

}
