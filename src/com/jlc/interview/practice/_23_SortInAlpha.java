package com.jlc.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _23_SortInAlpha {

	public static void main(String[] args) {

		// Sort a list of strings in alphabetical order 
		
		List<String> str = Arrays.asList("Zudio","Puma","Addidas","MAC","H&M");

		final List<String> sortedList = str.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedList);

		final List<String> sortedListDesc = sortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedListDesc);

	}

}
