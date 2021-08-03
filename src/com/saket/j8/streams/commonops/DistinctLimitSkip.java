package com.saket.j8.streams.commonops;
import java.util.List;
import java.util.stream.Stream;

import com.saket.j8.util.EmployeeUtil;
import com.saket.java8.domain.Employee;

//Distinct, Limit and Skip operations
public class DistinctLimitSkip {
	List<Employee> employees = EmployeeUtil.createEmployees();

	private void testDistinct() {
		Stream<String> employeesNamesStream = 
				employees
				.stream()
				.map(Employee::getName)
				.distinct();
		
		employeesNamesStream.forEach(System.out::println);
		
	}
	private void testLimit() {
		Stream<String> employeesNamesStream = 
				employees
				.stream()
				.map(Employee::getName)
				.distinct()
				.limit(100);
		
		employeesNamesStream.forEach(System.out::println);
	}
	
	private void testSkip() {
		Stream<String> employeesNamesStream = 
				employees
				.stream()
				.skip(2)
				.map(Employee::getName);
		
		employeesNamesStream.forEach(System.out::println);
	
	}

	public static void main(String[] args) {
//		new DistinctLimitSkip().testDistinct();
//		new DistinctLimitSkip().testLimit();
		new DistinctLimitSkip().testSkip();
	}

}
