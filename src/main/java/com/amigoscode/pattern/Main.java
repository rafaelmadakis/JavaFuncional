package com.amigoscode.pattern;

import java.time.LocalDate;

import static com.amigoscode.pattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0098765454444",
                LocalDate.of(2000, 1,1)
        );



//        System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db

        //Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw  new IllegalStateException(result.name());
        }

    }
}
