package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _45_ProductExploration {
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

        // price below 1000
        // list with price reduction 20%
        // average price of all products
        // product name with lowest price

//        List<Person> personPriceBelow1000 = persons.stream().filter(person -> person.getPrice() < 1000).collect(Collectors.toList());
//        for (Person p:personPriceBelow1000){
//            System.out.println(p);
//        }

        // price=price - ((price*20)/100)
        List<Person> priceReduction20 = persons.stream()
                .map(p->new Person(
                        p.getPid(),
                        p.getName(),
                        p.getAge(),
                        p.getPrice()-(p.getPrice()*20/100),
                        p.getCategory()
                )).collect(Collectors.toList());

        for (Person p:priceReduction20){
//            System.out.println(p);
        }

        // average price of all products
        final double productAvg = persons.stream().mapToDouble(p -> p.getPrice()).average().getAsDouble();
//        System.out.println(productAvg);

        // product name with lowest price
        final Optional<Double> max = persons.stream().map(p -> p.getPrice()).max(Comparator.naturalOrder());
        max.ifPresent(System.out::println);

    }
}
