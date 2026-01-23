package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _36_nameUpper {
    public static void main(String[] args) {
        // Transform Person object stream into a single string

        List<Employee> employees = Arrays.asList(
                new Employee("suman","suman@yahoo.com"),
                new Employee("ranju","ranju@gmail.com"),
                new Employee("manju","manju@jlc.com"),
                new Employee("arjun","arjun@gmail.com"),
                new Employee("sunaina","sunaina@yahoo.com"),
                new Employee("amit","amit@gmail.com")
        );

        final Map<String,Long> collect = employees.stream().map(emp -> emp.getEmail().substring(emp.getEmail().indexOf("@"))).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);
    }
}
