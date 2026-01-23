package com.jlc.interview.practice;

import java.util.stream.IntStream;

public class _18_Multiple {

	public static void main(String[] args) {

		// Write a program to multiply 1st and last element, 2nd and 2nd last element etc.
		
		int[] num = {4,5,1,7,2,9};

		 IntStream.range(0, num.length / 2)
				.map(x -> num[x] * num[num.length - x - 1])
				.forEach(System.out::println);


	}

}
