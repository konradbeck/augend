package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.TransactionAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionAccountRepository extends JpaRepository<TransactionAccount, Long>, JpaSpecificationExecutor<TransactionAccount> {

}
