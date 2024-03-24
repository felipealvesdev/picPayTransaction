package com.example.picpayTransaction.repositories;

import com.example.picpayTransaction.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
