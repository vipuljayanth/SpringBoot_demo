package com.example.SpringBoot_demo;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class DemoSpringBootCoreApplication implements CommandLineRunner {
    private static final Log LOGGER = LogFactory.getLog(DemoSpringBootCoreApplication.class);


    @Autowired
    CustomerLoginController customerLoginController;

    @Autowired
    Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootCoreApplication.class, args);
    }
    @Override
    public void run(String... args) throws hndBankException {
        try{
            CustomerLoginDTO customerLogin = new CustomerLoginDTO();
            customerLogin.setLoginName("harry");
            customerLogin.setPassword("harry123");
            System.out.println("-----------------");
            customerLoginController.authenticateCustomer(customerLogin);
            System.out.println("---------------------------");
            LOGGER.info(environment.getProperty("SUCCESS"));

        }catch(hndBankException exception ){
            LOGGER.error(environment.getProperty(exception.getMessage()));
        }
    }
}


