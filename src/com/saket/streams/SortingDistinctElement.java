package com.saket.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Sorting and Distinct Elements
 *
 * Problem:
 * Given a list of strings, use Java Streams to remove duplicates,
 * sort alphabetically, and join the results into a single comma-separated string.
 *
 * Input: ["apple", "banana", "apple", "orange", "banana"]
 * Expected Output: "apple,banana,orange"
 */
public class SortingDistinctElement {
       public static void main(String[] args){
           String result = Stream.of("apple", "banana", "apple", "orange", "banana")
                   .sorted()
                   .distinct()
                   .collect(Collectors.joining(", "));

           System.out.print(result);
       }
}
