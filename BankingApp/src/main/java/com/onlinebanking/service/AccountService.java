package com.onlinebanking.service;

import java.security.Principal;

import com.onlinebanking.entity.PrimaryAccount;
import com.onlinebanking.entity.SavingsAccount;


public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}