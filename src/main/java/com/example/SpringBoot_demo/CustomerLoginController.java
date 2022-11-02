package com.example.SpringBoot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller(value="customerLoginController")
public class CustomerLoginController {
    @Autowired
    private CustomerLoginService customerLoginService;
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws hndBankException {
        String b = customerLoginService.authenticateCustomer(customerLogin);
        return b;
    }
}


