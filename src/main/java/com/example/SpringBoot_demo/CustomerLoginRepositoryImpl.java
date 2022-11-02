package com.example.SpringBoot_demo;

import com.example.SpringBoot_demo.CustomerLoginDTO;
import com.example.SpringBoot_demo.CustomerLoginRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

    @Repository(value = "customerLoginRepository")
    public class CustomerLoginRepositoryImpl implements CustomerLoginRepository {
        public CustomerLoginDTO getCustomerLoginByLoginName(String loginName) {
            Map<String, String> customerCredentials = new HashMap<String, String>();
            customerCredentials.put("vipul", "vipul123");
            customerCredentials.put("harry", "harry123");
            customerCredentials.put("jayanth", "jayanth123");
            customerCredentials.put("monica", "monica123");
            CustomerLoginDTO customerLogin = new CustomerLoginDTO();
            customerLogin.setLoginName(loginName);
            customerLogin.setPassword(customerCredentials.get(loginName));
            return customerLogin;
        }
    }