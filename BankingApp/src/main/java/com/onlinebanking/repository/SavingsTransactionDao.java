package com.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinebanking.entity.SavingsTransaction;

import java.util.List;


public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}