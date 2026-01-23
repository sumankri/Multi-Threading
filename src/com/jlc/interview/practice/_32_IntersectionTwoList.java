package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _32_IntersectionTwoList {

	public static void main(String[] args) {

		// Find the intersection of two lists using Java streams
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		List<Integer> list2=Arrays.asList(3,5,6,7);

		final List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(collect);

	}

}
