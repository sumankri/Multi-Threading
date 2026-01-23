package com.jlc.interview.practice;

import java.util.Arrays;

public class ProductOfTwoElm {

	public static void main(String[] args) {

		// Find the products of the first two elements in an array
		
		int[] arr = {120,5,6,9,2,4};
		
		Arrays.stream(arr).boxed().limit(2).reduce((a,b)->a*b).ifPresent(a->System.out.println(a));
		
	}

}
