package com.onlinebanking.service;

import java.security.Principal;

import com.onlinebanking.entity.PrimaryAccount;
import com.onlinebanking.entity.SavingsAccount;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/08/18
 * Time: 04.32
 * To change this template use File | Settings | File Templates.
 */
public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}