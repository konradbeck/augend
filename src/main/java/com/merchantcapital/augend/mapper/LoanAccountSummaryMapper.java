package com.merchantcapital.augend.mapper;

import com.merchantcapital.augend.dto.LoanAccountSummaryDto;
import org.mapstruct.Mapper;

@Mapper
public interface LoanAccountSummaryMapper {

    com.merchantcapital.augend.model.LoanAccountSummary toLoanAccountSummary(LoanAccountSummaryDto loanAccountSummaryDto);

    LoanAccountSummaryDto fromLoanAccountSummary(com.merchantcapital.augend.model.LoanAccountSummary loanAccountSummary);
}
