package com.jlc.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _33_Domains {

	public static void main(String[] args) {

		// Find the occurrence of domains using Java streams 
		
		List<Employee> employees = Arrays.asList(
				new Employee("suman","suman@yahoo.com"),
				new Employee("ranju","ranju@gmail.com"),
				new Employee("manju","manju@jlc.com"),
				new Employee("arjun","arjun@gmail.com"),
				new Employee("sunaina","sunaina@yahoo.com"),
				new Employee("amit","amit@gmail.com")

		);

		Map<String, Long> collect = employees.stream().map(emp -> emp.getEmail().substring(emp.getEmail().indexOf("@")))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}

}
