package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _25_DistinctOddNum {

	public static void main(String[] args) {

		// Find and print the distinct odd numbers
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,9,9,10);

		list.stream().distinct().filter(n->n%2!=0).forEach(System.out::println);
		
	}

}
