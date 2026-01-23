package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _20_AllDistinct {

	public static void main(String[] args) {

//		In a given array of integers, return true if it contains distinct values
		
		int[] arr= {5,10,1,20,8,0};

		 List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		 List<Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
		boolean flag=collect.stream().noneMatch(n->n>1);
		System.out.println(flag);

	}

}
