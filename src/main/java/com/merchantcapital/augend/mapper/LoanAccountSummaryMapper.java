package com.merchantcapital.augend.mapper;

import com.merchantcapital.augend.dto.LoanAccountSummaryDto;
import com.merchantcapital.augend.dto.OfferDto;
import com.merchantcapital.augend.model.LoanAccountSummary;
import com.merchantcapital.augend.model.Offer;
import org.mapstruct.Mapper;

@Mapper
public interface LoanAccountSummaryMapper {

    LoanAccountSummary toLoanAccountSummary(LoanAccountSummaryDto loanAccountSummaryDto);

    LoanAccountSummaryDto fromLoanAccountSummary(LoanAccountSummary loanAccountSummary);
}
