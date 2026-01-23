package com.jlc.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MissingNum {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(3,4,2,6,1);
		
		// n*(n+1) / 2
		
		int expected = 0;
		int actual = 0;
		
		int max = num.size()+1;
		expected =max*(max+1)/2;
		
		for(Integer n:num) {
			actual = actual+n;
		}
		
		int missingNum = expected-actual;
		System.out.println(missingNum);
		
	}

}
