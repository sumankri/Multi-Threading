package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _35_squareOfInt {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        final List<Integer> collect = list.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(collect);
    }
}
