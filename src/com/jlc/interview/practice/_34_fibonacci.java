package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _34_fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34

        int a=0;
        int b=1;

        final List<Integer> collect = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(20).map(f -> f[0])
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
