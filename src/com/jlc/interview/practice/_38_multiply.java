package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _38_multiply {
    public static void main(String[] args) {
        int[] number = new int[]{1,2,3,4,5};

        final int asInt = Arrays.stream(number).reduce((a, b) -> a * b).getAsInt();
        System.out.println(asInt);
    }
}
