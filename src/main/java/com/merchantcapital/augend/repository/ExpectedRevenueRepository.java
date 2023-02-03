package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.ExpectedRevenue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpectedRevenueRepository extends JpaRepository<ExpectedRevenue, Long>, JpaSpecificationExecutor<ExpectedRevenue> {

}
