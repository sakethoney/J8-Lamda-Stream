package com.saket.j8.streams.commonops;
import java.util.List;
import java.util.stream.Stream;

import com.saket.j8.util.EmployeeUtil;
import com.saket.java8.domain.Employee;

//Mapping operation
public class Mapping {
	List<Employee> employees = EmployeeUtil.createEmployees();
	
	private void testMapping() {
		Stream<String> empStream = employees
				.stream()
				.map(Employee::getName)
				.map(String::toUpperCase);
		
		empStream.forEach(System.out::println);
	}
	public static void main(String[] args) {
		new Mapping().testMapping();
	}

}
