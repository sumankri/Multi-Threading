package com.jlc.interview.part2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab3 {
    public static void main(String[] args) {
        // string palindrome

        String str = "banana";

        List<Character> list =str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        Collections.reverse(list);

        String reversed=list.stream().map(String::valueOf).collect(Collectors.joining());
        if(str.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("not palindrome string");
        }
    }
}
