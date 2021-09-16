package com.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinebanking.entity.PrimaryTransaction;

import java.util.List;


public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}