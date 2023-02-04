package com.merchantcapital.augend.service;

import com.merchantcapital.augend.dto.LoanAccountSummaryDto;
import com.merchantcapital.augend.mapper.LoanAccountSummaryMapper;
import com.merchantcapital.augend.repository.LoanAccountSummaryRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LoanAccountSummaryService {

    private final LoanAccountSummaryMapper loanAccountSummaryMapper = Mappers.getMapper(LoanAccountSummaryMapper.class);

    private final LoanAccountSummaryRepository loanAccountSummaryRepository;

/*    public List<LoanAccountSummaryDto> accumulate(Map<Id, Date> loanAccountIdToDate)
    {
        if (loanAccountIdToDate == null)
            return null;
        if (loanAccountIdToDate.isEmpty())
            return new List<Loan_Account_Summary__c>();

        SObjectIndex loanAccountSummaryIndex = new SObjectIndex(new List<String>
        {
            Loan_Account_Summary__c.Loan_Account__c.getDescribe().getName(),
            Loan_Account_Summary__c.Date__c.getDescribe().getName()
        }).putAll(Database.query(LoanAccountSummaryQueries.getByLoanAccountIdSucceedingDateString(loanAccountIdToDate)));

        for (Id loanAccountId : loanAccountSummaryIndex.keySet(new Set<Id>()))
        {
            List<Loan_Account_Summary__c> loanAccountSummaries = loanAccountSummaryIndex.getAll(new Map<String, Object>{Loan_Account_Summary__c.Loan_Account__c.getDescribe().getName() => loanAccountId});

            setBalance(loanAccountSummaries);
            setSettlementBalance(loanAccountSummaries);
            setTopUpBalance(loanAccountSummaries);
        }

        return loanAccountSummaryIndex.values();
    }*/

    public LoanAccountSummaryDto createLoanAccountSummary(Long loanAccountId, Date date)
    {
        return LoanAccountSummaryDto.builder()
                .date(date)
                .loanAccountId(loanAccountId)
                .build();
    }

    public List<LoanAccountSummaryDto> saveAll(List<LoanAccountSummaryDto> loanAccountSummaries) {
        return loanAccountSummaryRepository.saveAll(loanAccountSummaries.stream()
                        .map(loanAccountSummaryMapper::toLoanAccountSummary)
                        .collect(Collectors.toList()))
                .stream()
                .map(loanAccountSummaryMapper::fromLoanAccountSummary)
                .collect(Collectors.toList());
    }

/*
    @TestVisible
    private List<Loan_Account_Summary__c> setBalance(List<Loan_Account_Summary__c> loanAccountSummaries)
    {
        if (ArrayUtils.isEmpty(loanAccountSummaries))
            return loanAccountSummaries;

        SObjectIndex loanAccountSummaryIndex = new SObjectIndex(new List<String>
        {
            Loan_Account_Summary__c.Id.getDescribe().getName()
        }).putAll(loanAccountSummaries);

        for (Loan_Account_Summary__c loanAccountSummary : (List<Loan_Account_Summary__c>)loanAccountSummaryIndex.values())
        {
            if (loanAccountSummary.Previous_Loan_Account_Summary__c != null)
            {
                if (loanAccountSummaryIndex.contains(loanAccountSummary.Previous_Loan_Account_Summary__c))
                    loanAccountSummary.Balance__c = ((Loan_Account_Summary__c)loanAccountSummaryIndex.get(loanAccountSummary.Previous_Loan_Account_Summary__c)).Balance__c;
                else
                    loanAccountSummary.Balance__c = loanAccountSummary.Previous_Loan_Account_Summary__r.Balance__c;
            }
            else
                loanAccountSummary.Balance__c = 0;

            loanAccountSummary.Balance__c += (NumberUtils.zeroIfNull(loanAccountSummary.Disbursement__c) +
                    NumberUtils.zeroIfNull(loanAccountSummary.Fee__c) -
                    NumberUtils.zeroIfNull(loanAccountSummary.Repayment__c) -
                    NumberUtils.zeroIfNull(loanAccountSummary.Write_Off__c)).setScale(2);
        }

        return loanAccountSummaries;
    }

    public List<Loan_Account_Summary__c> setPreviousLoanAccountSummaryId(List<Loan_Account_Summary__c> loanAccountSummaries)
    {
        if (ArrayUtils.isEmpty(loanAccountSummaries))
            return loanAccountSummaries;

        Map<Id, List<Date>> loanAccountIdToDates = new Map<Id, List<Date>>();

        for (Loan_Account_Summary__c loanAccountSummary : loanAccountSummaries)
        {
            if (loanAccountIdToDates.containsKey(loanAccountSummary.Loan_Account__c))
                loanAccountIdToDates.get(loanAccountSummary.Loan_Account__c).add(loanAccountSummary.Date__c.addDays(-1));
            else
                loanAccountIdToDates.put(loanAccountSummary.Loan_Account__c, new List<Date>{loanAccountSummary.Date__c.addDays(-1)});
        }

        SObjectIndex loanAccountSummaryIndex = new SObjectIndex(new List<String>
        {
            Loan_Account_Summary__c.Loan_Account__c.getDescribe().getName(),
            Loan_Account_Summary__c.Date__c.getDescribe().getName()
        }).putAll(Database.query(LoanAccountSummaryQueries.getByLoanAccountIdToDatesString(loanAccountIdToDates)));

        for (Loan_Account_Summary__c loanAccountSummary : loanAccountSummaries)
            loanAccountSummary.Previous_Loan_Account_Summary__c = loanAccountSummaryIndex.get(new Loan_Account_Summary__c(Loan_Account__c = loanAccountSummary.Loan_Account__c, Date__c = loanAccountSummary.Date__c.addDays(-1)))?.Id;

        return loanAccountSummaries;
    }

    public List<Loan_Account_Summary__c> setRollingLoanAccountSummaryId(List<Loan_Account_Summary__c> loanAccountSummaries)
    {
        if (ArrayUtils.isEmpty(loanAccountSummaries))
            return loanAccountSummaries;

        Map<Id, List<Date>> loanAccountIdToDates = new Map<Id, List<Date>>();

        for (Loan_Account_Summary__c loanAccountSummary : loanAccountSummaries)
            if (loanAccountIdToDates.containsKey(loanAccountSummary.Loan_Account__c))
                loanAccountIdToDates.get(loanAccountSummary.Loan_Account__c).add(loanAccountSummary.Date__c.addDays(-35));
            else
                loanAccountIdToDates.put(loanAccountSummary.Loan_Account__c, new List<Date>{loanAccountSummary.Date__c.addDays(-35)});

        SObjectIndex loanAccountSummaryIndex = new SObjectIndex(new List<String>
        {
            Loan_Account_Summary__c.Loan_Account__c.getDescribe().getName(),
            Loan_Account_Summary__c.Date__c.getDescribe().getName()
        }).putAll(Database.query(LoanAccountSummaryQueries.getByLoanAccountIdToDatesString(loanAccountIdToDates)));

        for (Loan_Account_Summary__c loanAccountSummary : loanAccountSummaries)
            loanAccountSummary.Rolling_Loan_Account_Summary__c = loanAccountSummaryIndex.get(new Loan_Account_Summary__c(Loan_Account__c = loanAccountSummary.Loan_Account__c, Date__c = loanAccountSummary.Date__c.addDays(-35)))?.Id;

        return loanAccountSummaries;
    }

    @TestVisible
    private List<Loan_Account_Summary__c> setSettlementBalance(List<Loan_Account_Summary__c> loanAccountSummaries)
    {
        if (ArrayUtils.isEmpty(loanAccountSummaries))
            return loanAccountSummaries;

        SObjectIndex loanAccountSummaryIndex = new SObjectIndex(new List<String>
        {
            Loan_Account_Summary__c.Id.getDescribe().getName()
        }).putAll(loanAccountSummaries);

        for (Loan_Account_Summary__c loanAccountSummary : (List<Loan_Account_Summary__c>)loanAccountSummaryIndex.values())
        {
            if  (loanAccountSummary.Previous_Loan_Account_Summary__c != null)
            {
                if (loanAccountSummaryIndex.contains(loanAccountSummary.Previous_Loan_Account_Summary__c))
                    loanAccountSummary.Settlement_Balance__c = ((Loan_Account_Summary__c)loanAccountSummaryIndex.get(loanAccountSummary.Previous_Loan_Account_Summary__c)).Settlement_Balance__c;
                else
                    loanAccountSummary.Settlement_Balance__c = loanAccountSummary.Previous_Loan_Account_Summary__r.Settlement_Balance__c;
            }
            else
                loanAccountSummary.Settlement_Balance__c = 0;

            loanAccountSummary.Settlement_Balance__c += (loanAccountSummary.Settlement_Balance__c * (NumberUtils.zeroIfNull(loanAccountSummary.Loan_Account__r.Factor_Rate__r.Settlement_Interest_Rate__c) / 365 / 100) +
                    NumberUtils.zeroIfNull(loanAccountSummary.Disbursement__c) -
                    NumberUtils.zeroIfNull(loanAccountSummary.Repayment__c)).setScale(2);
        }

        return loanAccountSummaries;
    }

    @TestVisible
    private List<Loan_Account_Summary__c> setTopUpBalance(List<Loan_Account_Summary__c> loanAccountSummaries)
    {
        if (ArrayUtils.isEmpty(loanAccountSummaries))
            return loanAccountSummaries;

        SObjectIndex loanAccountSummaryIndex = new SObjectIndex(new List<String>
        {
            Loan_Account_Summary__c.Id.getDescribe().getName()
        }).putAll(loanAccountSummaries);

        for (Loan_Account_Summary__c loanAccountSummary : (List<Loan_Account_Summary__c>)loanAccountSummaryIndex.values())
        {
            if  (loanAccountSummary.Previous_Loan_Account_Summary__c != null)
            {
                if (loanAccountSummaryIndex.contains(loanAccountSummary.Previous_Loan_Account_Summary__c))
                    loanAccountSummary.Top_Up_Balance__c = ((Loan_Account_Summary__c)loanAccountSummaryIndex.get(loanAccountSummary.Previous_Loan_Account_Summary__c)).Top_Up_Balance__c;
                else
                    loanAccountSummary.Top_Up_Balance__c = loanAccountSummary.Previous_Loan_Account_Summary__r.Top_Up_Balance__c;
            }
            else
                loanAccountSummary.Top_Up_Balance__c = 0;

            loanAccountSummary.Top_Up_Balance__c += (loanAccountSummary.Top_Up_Balance__c * (NumberUtils.zeroIfNull(loanAccountSummary.Loan_Account__r.Factor_Rate__r.Top_Up_Interest_Rate__c) / 365 / 100) +
                    NumberUtils.zeroIfNull(loanAccountSummary.Disbursement__c) -
                    NumberUtils.zeroIfNull(loanAccountSummary.Repayment__c)).setScale(2);
        }

        return loanAccountSummaries;
    }*/
}
