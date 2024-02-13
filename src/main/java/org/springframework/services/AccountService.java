package org.springframework.services;

import org.springframework.entityes.Account;
import org.springframework.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service //Dependency Injection
public class AccountService {
    private final AccountRepository accountRepository;


    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Map<String, String> getAccountsMap(List<String> bic) {
        List<Account> accounts = accountRepository.findByBicIn(bic);
        Map<String, String> accountsMap = new HashMap<>();
        for (Account account : accounts) {
            accountsMap.put(account.getBic(), account.getCorraccount());
        }
        return accountsMap;
    }
}
