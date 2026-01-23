package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _3_SecHighestWord {

	public static void main(String[] args) {
		
		// Find the word that has the second highest length
		
		String str = "I am learning Streams API in java";

		Arrays.stream(str.split(" "))
				.sorted(Comparator.comparingInt(String::length).reversed())
				.skip(1)
				.findFirst()
				.ifPresent(System.out::println);

	}

}
