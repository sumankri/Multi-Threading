package com.jlc.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class _19_ZerosBeginning {

	public static void main(String[] args) {

		// Write a stream program to move all zero’s beginning of array
		
		int[] arr = {5,0,1,0,8,0};

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		List<Integer> zeros = list.stream().filter(n -> n == 0).collect(Collectors.toList());
		List<Integer> nonZeros=list.stream().filter(n->n!=0).collect(Collectors.toList());

		List<Integer> mylist = new ArrayList<>();
		mylist.addAll(zeros);
		mylist.addAll(nonZeros);

		System.out.println(mylist);

		list.stream()
				.collect(Collectors.partitioningBy(n->n!=0))
				.entrySet()
				.stream()
				.forEach(e-> System.out.println(e.getValue()));

	}

}
