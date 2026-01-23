package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _44_AvoidComplexStream {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person(101,"suman",34,2300,"Soap"),
                new Person(102,"sunaina",24,1200,"Washing Powder"),
                new Person(103,"ranju",25,1300,"Blanket"),
                new Person(104,"sanju",15,500,"Bottle"),
                new Person(105,"raju",55,700,"Toothbrush"),
                new Person(106,"rajan",35,900,"Pen Book"),
                new Person(107,"atul",12,400,"Ice cream"),
                new Person(108,"somu",18,100,"Pencil")

        );

        // age greater than 30
        // name unique
        // name sorted order

        final List<String> collect = persons.stream().filter(p -> p.getAge() > 30).map(Person::getName).sorted().collect(Collectors.toList());
        System.out.println(collect);
    }

}
