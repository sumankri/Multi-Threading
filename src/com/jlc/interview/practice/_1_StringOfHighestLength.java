package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _1_StringOfHighestLength {

	public static void main(String[] args) {
		//Given a sentence, find the word that has the highest length
		
		String str = "I am learning Streams API in java environment";

		Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length))
				.ifPresent(System.out::println);
		System.out.println("----- TESTING MULTIPLE ---------");
	}

}
