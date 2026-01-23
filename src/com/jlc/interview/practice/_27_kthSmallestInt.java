package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _27_kthSmallestInt {

	public static void main(String[] args) {

		// Find the kth smallest element in a list of integers
		
		List<Integer> list = Arrays.asList(7,1,6,2,1,3,4,5);
		int k=3;

		list.stream().distinct().sorted(Comparator.naturalOrder()).skip(k-1).findFirst().ifPresent(System.out::println);
		
	}

}
