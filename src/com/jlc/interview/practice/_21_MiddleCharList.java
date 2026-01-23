package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _21_MiddleCharList {

	public static void main(String[] args) {

		// Given the string[] group the strings based on the middle character
		// o/p - w[ewe,kwk]
		
		String[] str = {"ewe","jji","jhj","kwk","aha"};
		final Map<String, List<String>> collect = Arrays.stream(str)
				.collect(Collectors.groupingBy(st -> st.substring(1, 2)));
		System.out.println(collect);

	}

}
