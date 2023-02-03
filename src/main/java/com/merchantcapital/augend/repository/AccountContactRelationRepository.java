package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.AccountContactRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountContactRelationRepository extends JpaRepository<AccountContactRelation, Long>, JpaSpecificationExecutor<AccountContactRelation> {

}
