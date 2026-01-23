package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _2_DistinctChar {

	public static void main(String[] args) {

		// Remove duplicates from the string and return in the same order
		
		String str = "adbbdfghg";

		str.chars().mapToObj(c->(char)c).distinct().forEach(System.out::print);
	}

}
