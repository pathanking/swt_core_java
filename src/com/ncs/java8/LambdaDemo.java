package com.ncs.java8;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = num -> num % 2 == 1;
        System.out.println("Enter A Number to check It is Odd or Not: ");
        System.out.println("Odd : " + predicate.test(new Scanner(System.in).nextInt()));

        IntFunction intFunction = (int num) -> num * num;
        System.out.println("Square : " + intFunction.apply(12));

        BiFunction<Integer, Integer, Integer> biFunction = (m, n) -> m + n;
        System.out.println("Sum : " + biFunction.apply(20, 30));

        BiFunction<String, String, String> stringBiFunction = (a, b) ->
                a.toUpperCase() + ":" + b.toUpperCase();
        System.out.println(stringBiFunction.apply("hello", "world"));

        Predicate<String> stringPredicate = String::isBlank;
        System.out.println("Is Blank ? "+stringPredicate.test("data!!"));

        Consumer<String> stringConsumer = (myString) -> System.out.println(myString);
        stringConsumer.accept("hi there!!");
    }
}
