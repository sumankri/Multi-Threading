package com.jlc.interview.part2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lab2 {
    public static void main(String[] args) {
        // reverse number
        
        int num = 893276;

//        List<Integer> numList = IntStream.of(num).boxed().collect(Collectors.toList());
        // IntStream.of(num) - here num act as a single value so reverse of num is not possible

        List<Character> list = String.valueOf(num).chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        Collections.reverse(list);
        System.out.println(list);

        String numList = list.stream().map(String::valueOf).collect(Collectors.joining());

        System.out.println(numList);

    }
}
