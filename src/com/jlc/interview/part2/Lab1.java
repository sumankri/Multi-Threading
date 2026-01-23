package com.jlc.interview.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab1 {
    public static void main(String[] args) {
        // reverse string and number

        String str = "suman kumari";

        List<Character> list = str.chars().mapToObj(
                        c -> (char) c
                )
                .collect(Collectors.toList());

        Collections.reverse(list);

        StringBuilder reversed = new StringBuilder();
        for(Character ch : list){
            reversed.append(ch);
        }

        System.out.println(reversed);
    }
}
