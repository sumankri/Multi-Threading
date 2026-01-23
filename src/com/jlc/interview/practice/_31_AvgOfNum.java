package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _31_AvgOfNum {

	public static void main(String[] args) {

		// Calculate the average of all the numbers
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);

		double avg=num.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
		System.out.println(avg);
	}

}
