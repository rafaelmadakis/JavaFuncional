package com.amigoscode.optinals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Supplier<IllegalStateException> exception = ()
//                -> new IllegalStateException("exceptiopn");

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("sending email to " + email),
                        () -> System.out.println("Cannot send email"));



    }
}
