package com.priceminister.account.implementation;

import com.priceminister.account.*;


public class CustomerAccount implements Account {
    
    private Double amountAccount;
    
    public CustomerAccount() {
        this.amountAccount = 0.0;
    }
    
    public void setAmountAccount(Double amount) {
        this.amountAccount = amount;
    }
    
    public Double getAmountAccount() {
        // TODO Auto-generated method stub
        return this.amountAccount;
    }

    public void add(Double addedAmount) {
        // TODO Auto-generated method stub
        this.amountAccount += addedAmount;
    }

    public Double getBalance() {
        // TODO Auto-generated method stub
        return getAmountAccount();
    }

    public Double withdrawAndReportBalance(Double withdrawnAmount, AccountRule rule) 
    		throws IllegalBalanceException {
        // TODO Auto-generated method stub
        return null;
    }

}
