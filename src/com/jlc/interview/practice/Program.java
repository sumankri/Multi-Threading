package com.jlc.interview.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// Find the occurrence of domains using Java streams 
		
		Employee e1=new Employee("Sam","sam@gmail.com");
		Employee e2=new Employee("Adam","adam@yahoo.com");
		Employee e3=new Employee("Peter","peter@gmail.com");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		Map<String, Long> collect = empList.stream().map(emp->emp.getEmail().substring(emp.getEmail().indexOf("@")))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
		
	}

}
