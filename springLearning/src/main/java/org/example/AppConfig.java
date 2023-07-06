package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address() {
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("New York");
        return address;
    }

    @Bean
    public Account account() {
        Account account = new Account();
        account.setAccountNumber("123456789");
        account.setBalance(1000.0);
        return account;
    }

    @Bean
    public Person person() {
        return new Person();
    }
}
