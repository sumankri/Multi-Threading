package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _37_namesStartWith {
    public static void main(String[] args) {
        // Group list of strings by their first character and count the number of strings

        List<String> names= Arrays.asList("apple","banana","apricot","cherry","blueberry","avocado");

        final Map<Character, Long> collect = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));
        System.out.println(collect);

    }
}
