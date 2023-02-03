package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.PaymentAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentAccountRepository extends JpaRepository<PaymentAccount, Long>, JpaSpecificationExecutor<PaymentAccount> {

}
