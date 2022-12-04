package com.amigoscode.inter;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        //function takes 1 argument and produces 1 result
        int increment = incrementByOneFunction(1);
        System.out.println(increment);

        Integer incremente2 = incrementByOneFunction.apply(1);
        System.out.println(incremente2);

        int multiply = multiplyBy10Function.apply(incremente2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        //BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 100));


        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));

    }


    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOneFunction(int number) {
        return number + 1;
    }

   static BiFunction<Integer, Integer, Integer>  incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;


    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
