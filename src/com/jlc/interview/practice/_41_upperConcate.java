package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _41_upperConcate {
    public static void main(String[] args) {
        // Convert a list of string to uppercase and then concatenate

        List<String> alphabets = Arrays.asList("a","b","c","d","e");

        final String collect = alphabets.stream().map(s -> s.toUpperCase()).collect(Collectors.joining());
        System.out.println(collect);
    }
}
