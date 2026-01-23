package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _7_ListEvenOdd {

	public static void main(String[] args) {

		// Divide given integer list into lists of even and odd numbers
		
		int[] arr = {1,2,3,4,5,6,7,8};

		final List<Integer> list = Arrays.stream(arr).boxed()
				.collect(Collectors.toList());

		final Map<Boolean, List<Integer>> collect = list.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.toList()));
		collect.entrySet().forEach(e-> System.out.println(e.getValue()));


	}

}
