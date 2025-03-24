package com.saket.streams;

import java.util.stream.Stream;

/**
 * Finding Max or Min Using Streams
 *
 * Problem:
 * Given a list of integers, use Java Streams to find the second largest
 * unique number in the list.
 *
 * Input: [4, 2, 8, 6, 8, 5]
 */
public class FindingMaxAndMin {

    public static void main(String[] args){
        Integer result = Stream.of(4, 2, 8, 6, 8, 5)
                .sorted((a,b) -> b - a)
                .distinct()
                .skip(1)
                .findFirst().get();

        System.out.print(result);
    }

}
