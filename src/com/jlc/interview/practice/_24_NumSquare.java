package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _24_NumSquare {

	public static void main(String[] args) {

		// Convert a list of integers to a list of their squares
		
		List<Integer> number =Arrays.asList(1,2,3,4,5);
		number.stream().mapToInt(num->num*num).forEach(System.out::print);

	}

}
