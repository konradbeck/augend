package com.merchantcapital.augend.mapper;

import com.merchantcapital.augend.dto.AccountDto;
import com.merchantcapital.augend.model.Account;
import org.mapstruct.Mapper;

@Mapper
public interface AccountMapper {

    Account toAccount(AccountDto AccountDto);

    AccountDto fromAccount(Account Account);
}
