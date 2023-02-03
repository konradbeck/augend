package com.merchantcapital.augend.repository;

import com.merchantcapital.augend.model.RevenueStream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RevenueStreamRepository extends JpaRepository<RevenueStream, Long>, JpaSpecificationExecutor<RevenueStream> {

}
