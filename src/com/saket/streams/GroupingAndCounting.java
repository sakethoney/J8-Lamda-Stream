package com.saket.streams;

import com.saket.java8.domain.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Grouping and Counting
 *
 * <p>Problem: Given a list of employee objects (Employee{name, department}),
 * use Java Streams to
 * count the number of employees in each department.
 */
public class GroupingAndCounting {
  public static void main(String[] args) {

    List<Employee> employees =
        Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "Engineering"),
            new Employee("Charlie", "HR"),
            new Employee("David", "Engineering"),
            new Employee("Eve", "Marketing"));

      Map<String, Long> result = employees
              .stream()
              .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

      result.forEach((k,v)-> System.out.println(k+" : "+v));
  }
}
