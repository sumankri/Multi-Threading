package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _13_GroupNoByRange {

	public static void main(String[] args) {

		// Given an array of integers, group the numbers by the range

		int[] arr = { 2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54 };

		// o/p - {0==[2,3], 10 = [10,14],20=[20,24],30=[30,34],40=[40,44],50=[50,54]};

		final List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		final Map<Integer, List<Integer>> result = list.stream()
				.collect(Collectors.groupingBy(x -> x / 10 * 10, Collectors.toList()));

		System.out.println(result);

	}

}
