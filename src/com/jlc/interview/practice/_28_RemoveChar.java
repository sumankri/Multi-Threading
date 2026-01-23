package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;

public class _28_RemoveChar {

	public static void main(String[] args) {

		// Remove all non-numeric characters from a list
		
		List<String> list = Arrays.asList("a1b2c3","1a2b3c","123abc");

		list.stream().map(word->word.replaceAll("[0-9]+","")).forEach(System.out::println);
		
	}

}
