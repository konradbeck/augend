package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.TransactionRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRuleRepository extends JpaRepository<TransactionRule, Long>, JpaSpecificationExecutor<TransactionRule> {

}
