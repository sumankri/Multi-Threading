package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _11_FirstNonRepeatChar {

	public static void main(String[] args) {

		// Given a string, find the first non-repeated character
		
		String str = "Hello World";

		Arrays.stream(str.split(""))
				.filter(c->str.indexOf(c)==str.lastIndexOf(c))
				.skip(1)
				.findFirst()
				.ifPresent(System.out::println);

	}

}
