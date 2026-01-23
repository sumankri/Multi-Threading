package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _6_CountWithNoVowels {
	
	public static void main(String[] args) {
		
		// Given a sentence, find the words with a specified number of vowels 
		
		String str = "I am learning Streams API in Java";
		int v=2;

		Arrays.stream(str.split(" "))
				.filter(st->st.replaceAll("[^aeiou]","").length()==3)
				.forEach(System.out::println);

	}
}
