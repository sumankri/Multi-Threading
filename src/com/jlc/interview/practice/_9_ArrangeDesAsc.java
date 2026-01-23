package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _9_ArrangeDesAsc {

	public static void main(String[] args) {

		// Arrange the numbers in Descending/Ascending Order
		
		int[] arr = {1,2,3,4,5,6,7,8};

		final List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Collections.shuffle(list);

		System.out.println(list);

		final List<Integer> sortedAsc = list.stream()
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());

		final List<Integer> sortedDesc =
				list.stream()
						.sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(sortedAsc);
		System.out.println(sortedDesc);

	}

}
