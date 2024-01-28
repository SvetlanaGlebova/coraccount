package org.springframework.controllers;
import org.springframework.services.AccountService;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;
import java.util.Map;

@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping ("/accounts")
    public Map<String, String> getAccounts (@RequestBody List<String> bic) {
      return accountService.getAccountsMap(bic);
    }
}
