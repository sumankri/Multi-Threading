package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _12_FirstRepeatChar {

	public static void main(String[] args) {

		// Given a string, find the first repeated character
		
		String str = "Heello World";

		Arrays.stream(str.split(""))
				.filter(c->str.indexOf(c)!=str.lastIndexOf(c))
				.findFirst()
				.ifPresent(System.out::println);

	}

}
