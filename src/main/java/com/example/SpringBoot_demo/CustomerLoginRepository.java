package com.example.SpringBoot_demo;
import com.example.SpringBoot_demo.CustomerLoginDTO;
public interface CustomerLoginRepository {
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
