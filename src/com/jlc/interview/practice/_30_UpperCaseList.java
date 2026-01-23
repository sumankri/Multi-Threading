package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _30_UpperCaseList {

	public static void main(String[] args) {

		// Convert a list of strings to uppercase
		
		List<String> list = Arrays.asList("breaking bad","game of thrones","big bang theory");
		
list.stream().map(String::toUpperCase).forEach(System.out::println);
		 
	}

}
