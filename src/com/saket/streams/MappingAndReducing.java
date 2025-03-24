package com.saket.streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Mapping and Reducing
 *
 * Problem:
 * Using Java Streams, calculate the sum of the squares of all positive integers
 * in a list.
 *
 * Input: [-3, 1, 4, -2, 5]
 * Expected Output: 42 (because 1² + 4² + 5² = 1 + 16 + 25 = 42)
 *
 * Follow-Up:
 * How would you parallelize this calculation?
 */
public class MappingAndReducing {
    public static void main(String[] args){
        int sumOfSquares = Stream.of(-3, 1, 4, -2, 5)
                .filter(i -> i>=0)
                .mapToInt(item -> item*item)
                .sum();
        System.out.print(sumOfSquares);
    }
}
