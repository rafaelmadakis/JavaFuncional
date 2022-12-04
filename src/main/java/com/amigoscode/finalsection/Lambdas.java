package com.amigoscode.finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    Integer number = null;
    int counter = 0;

    public static void main(String[] args) {

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex", 20));

    }

}
