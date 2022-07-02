package com.springexample.account.dto;

import com.springexample.account.model.Transaction;

public class TransactionDtoConverter {
    public TransactionDto convert (Transaction from){
        return new Transaction(from.getId(), from.getTransactionType(), from.getAmount(), from.getTransactionDate());
    }
}
