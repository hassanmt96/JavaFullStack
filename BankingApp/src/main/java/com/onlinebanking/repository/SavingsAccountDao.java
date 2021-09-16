package com.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinebanking.entity.SavingsAccount;


public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}