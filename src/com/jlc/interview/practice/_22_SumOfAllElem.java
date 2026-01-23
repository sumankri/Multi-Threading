package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;

public class _22_SumOfAllElem {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

		num.stream().reduce((a,b)->a+b).ifPresent(System.out::println);


	}

}
