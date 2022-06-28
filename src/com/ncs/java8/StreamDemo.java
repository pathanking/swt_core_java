package com.ncs.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] strings = {"idk", "hello", "woh", "you", "gts", "there"};

        Arrays.stream(strings).map(string -> string.toUpperCase()).sorted().forEach(System.out::println);

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println("-------------------- Odd Numbers ------------------------");
        var oddSquareSum = IntStream.of(ints).filter(e -> e % 2 == 1).map(e -> e * e).sum();
        System.out.println("Sum of Square of Odd Numbers : " + oddSquareSum);
        //System.out.println("-------------------- Even Numbers -----------------------");
        var sum = IntStream.of(ints).filter(e -> e % 2 == 0).sum();
        System.out.println("Sum Of Even Numbers : " + sum);
    }
}
