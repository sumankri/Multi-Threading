package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.Comparator;

public class _4_SecHighLengthOfWord {

	public static void main(String[] args) {
		
		// Find the 2nd highest length word in the given sentence
		
		String str = "I am learning Streams API in java";

		Arrays.stream(str.split(" "))
				.map(String::length)
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.ifPresent(System.out::println);

	}

}
