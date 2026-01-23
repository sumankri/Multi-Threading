package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _15_ProductOfTwo {

	public static void main(String[] args) {

//		Find the products of the first two elements in an array

		int[] arr = {12,5,6,9,2,4};

		final List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		list.stream().limit(2).reduce((a,b)->a*b).ifPresent(System.out::println);
	}

}
