package com.jlc.interview.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _5_OccurrenceOfWord {

	public static void main(String[] args) {

		// Given a sentence, find the occurrence of each word
		
		String str = "I am learning Streams API in java Java";

		TreeMap<String,Long> map=Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(
						Function.identity(),
						() -> new TreeMap<>(String.CASE_INSENSITIVE_ORDER),
						Collectors.counting()));

		System.out.println(map);
	}

}
