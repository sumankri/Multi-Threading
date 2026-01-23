package com.jlc.interview.practice;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _8_OccurOfEachChar {

	public static void main(String[] args) {

		// Given a word, find the occurrence of each character 
		
		String s = "Mississippim";

		final Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);
	}

}
