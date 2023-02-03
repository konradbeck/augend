package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.TransactionDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDefinitionRepository extends JpaRepository<TransactionDefinition, Long>, JpaSpecificationExecutor<TransactionDefinition> {

}
