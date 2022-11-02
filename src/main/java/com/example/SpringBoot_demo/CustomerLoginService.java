package com.example.SpringBoot_demo;
import  com.example.SpringBoot_demo.CustomerLoginDTO;
import com.example.SpringBoot_demo.hndBankException;

public interface CustomerLoginService {
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws hndBankException;


}


