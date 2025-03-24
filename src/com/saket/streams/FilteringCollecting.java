package com.saket.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Problem:
 * Given a list of integers, use Java Streams to filter out even numbers,
 * square the remaining odd numbers, and collect the results into a new list.
 *
 * Input: [1, 2, 3, 4, 5]
 * Expected Output: [1, 9, 25]
 */
public class FilteringCollecting {
    public static void main(String[] args){
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
                .stream()
                .filter(i -> i % 2 != 0)
                .map(e -> e*e)
                .collect(Collectors.toList());
        System.out.print("[ ");
        result.forEach(item -> {

            System.out.print(item);
            System.out.print(" ");
        });
        System.out.print("]");
    }
}
