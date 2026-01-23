package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _17_MultiplyAlterNum {

	public static void main(String[] args) {

		// Write a stream program to multiply alternative numbers in an array
		
		int[] num = {4,5,1,7,2,9,2};
		
		// o/p - 16
		final int reduce = IntStream.range(0, num.length)
				.filter(n -> n % 2 == 0)
				.map(x -> num[x])
				.reduce(1, (a, b) -> a * b);

		System.out.println(reduce);

	}

}
