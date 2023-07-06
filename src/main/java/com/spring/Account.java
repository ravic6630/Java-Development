package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private String accountNumber;

//    public Account(String accountNumber){
//        this.accountNumber=accountNumber;
//    }
    public void print()
    {
        System.out.println("This is your account");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
