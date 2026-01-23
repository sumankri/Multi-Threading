package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _38_ListToMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("suman","suman@yahoo.com"),
                new Employee("ranju","ranju@gmail.com"),
                new Employee("manju","manju@jlc.com"),
                new Employee("arjun","arjun@gmail.com"),
                new Employee("sunaina","sunaina@yahoo.com"),
                new Employee("amit","amit@gmail.com")
        );

        final Map<String, String> collect = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getEmail));
        System.out.println(collect);

    }
}
