package com.saket.streams;

import java.util.stream.Stream;

/**
 * Matching with Predicates
 *
 * Problem:
 * Given a list of integers, use Java Streams to determine whether all
 * elements are positive, at least one element is negative, and no elements are zero.
 *
 * Input: [1, 3, 4, -2, 6]
 * Expected Output:
 *
 *     All positive? false
 *
 *     Any negative? true
 *
 *     None zero? true
 */
public class MatchingWithPredicate {
    public static void main(String[] args){
        boolean negative  = Stream.of(1, 3, 4, -2, 6)
                .anyMatch(e -> e<0);
        boolean positive  = Stream.of(1, 3, 4, -2, 6)
                .allMatch(e -> e>0);
        boolean noneMatch  = Stream.of(1, 3, 4, -2, 6, 0)
                .noneMatch(e -> e==0);
        System.out.println("All positive? "+ positive);

        System.out.println("Any negative? "+ negative);

        System.out.println("None Zero "+ noneMatch);
    }
}
