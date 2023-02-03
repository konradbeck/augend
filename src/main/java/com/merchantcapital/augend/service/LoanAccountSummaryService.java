package com.merchantcapital.augend.service;

import com.merchantcapital.augend.dto.LoanAccountSummaryDto;
import com.merchantcapital.augend.mapper.LoanAccountSummaryMapper;
import com.merchantcapital.augend.repository.LoanAccountSummaryRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LoanAccountSummaryService {

    private final LoanAccountSummaryMapper loanAccountSummaryMapper = Mappers.getMapper(LoanAccountSummaryMapper.class);

    private final LoanAccountSummaryRepository loanAccountSummaryRepository;

    public List<LoanAccountSummaryDto> save(List<LoanAccountSummaryDto> loanAccountSummaryDtos)
    {
        return loanAccountSummaryRepository.saveAll(loanAccountSummaryDtos.stream()
                        .map(loanAccountSummaryMapper::toLoanAccountSummary)
                        .collect(Collectors.toList()))
                .stream()
                .map(loanAccountSummaryMapper::fromLoanAccountSummary)
                .collect(Collectors.toList());
    }
}