package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _10_SumOfUnique {

	public static void main(String[] args) {

		// Given an array, find the sum of unique elements 
		
		int[] arr = {1,6,7,8,1,1,8,8,7};

		final int sum =
				Arrays.stream(arr)
				.distinct().sum();
		System.out.println(sum);


	}

}
