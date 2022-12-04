package com.amigoscode.inter;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        //Normal Java function
        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);
        greetCustomerV2(maria, false);

        // Consumer Functional interface
        greetConsumerConsumer.accept(maria);

        greetConsumerConsumerV2.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetConsumerConsumerV2 = (customer, showPhoneNumber )->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    ( showPhoneNumber ? customer.customerPhoneNumber : "***********"));

    static Consumer<Customer> greetConsumerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                ( showPhoneNumber ? customer.customerPhoneNumber : "***********"));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
