package com.saket.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using FlatMap
 *
 * Problem:
 * Given a list of lists containing integers, flatten it using Java Streams
 * and return the distinct integers in ascending order.
 *
 * Input: [[1, 3], [3, 4, 5], [5, 6]]
 * Expected Output: [1, 3, 4, 5, 6]
 */
public class FlatMapExample {
    public static void main(String[] args){
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Adding lists to the list of lists
        listOfLists.add(Arrays.asList(1, 2, 3, 3));
        listOfLists.add(Arrays.asList(4, 5, 2));
        listOfLists.add(Arrays.asList(6, 7, 8, 9));

        List<Integer> result =listOfLists.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted((a,b) -> b - a)
                .collect(Collectors.toList());

        result.forEach(System.out::print);
    }

}
