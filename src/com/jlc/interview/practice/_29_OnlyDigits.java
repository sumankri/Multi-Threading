package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _29_OnlyDigits {

	public static void main(String[] args) {

		// Find and print strings containing only digits
		
		List<String> list = Arrays.asList("123","abc","123abc","45");

		list.stream().filter(word->word.matches("[0-9]+")).forEach(System.out::println);
		
	}

}
