package com.jlc.interview.part2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab4 {
    public static void main(String[] args) {
        // palindrome number

        int num = 123218;

        List<Character> list=String.valueOf(num).chars().mapToObj(c->(char)c).collect(Collectors.toList());
        Collections.reverse(list);

        String numReversed=list.stream().map(String::valueOf).collect(Collectors.joining());
        int numList=Integer.parseInt(numReversed);

        System.out.println(numList);
    }
}
