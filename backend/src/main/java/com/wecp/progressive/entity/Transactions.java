package com.wecp.progressive.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Transactions {

    //@Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="transaction_id")
    private int transactionId;

    //@Column(name="account_id",nullable = false)
    private int accountId;

   // @Column(name = "amount",nullable = false)
    private Double amount;

    //@Column(name = "transactionDate",nullable = false)
    private Date transactionDate;

    //@Column(name="transactionType",nullable = false)
    private String transactionType;
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public Transactions(int transactionId, int accountId, Double amount, Date transactionDate, String transactionType) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    

}