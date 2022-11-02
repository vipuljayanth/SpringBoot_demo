package com.example.SpringBoot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {
        @Autowired
        private CustomerLoginRepository customerLoginRepository;
        public String authenticateCustomer(CustomerLoginDTO customerLogin) throws hndBankException {
            String toRet = null;
            CustomerLoginDTO customerLoginFromRepository = customerLoginRepository
                    .getCustomerLoginByLoginName(customerLogin.getLoginName());
            if (customerLogin.getPassword().equals(customerLoginFromRepository.getPassword())){
                toRet = "SUCCESS";
            }else{
                throw new hndBankException("Service.WRONG_CREDENTIALS");
            }
            return toRet;
        }

}
