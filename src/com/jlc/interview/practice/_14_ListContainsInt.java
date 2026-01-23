package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _14_ListContainsInt {

	public static void main(String[] args) {

		// Given a list of strings, create a list that contains only integers

		String[] s = { "abc", "123", "456", "xyz" };

		List<String> wordWithInt=Arrays.stream(s)
				.peek(e-> System.out.println("Before - " + e))
				.filter(st->st.matches("[0-9]+"))
				.peek(e-> System.out.println("after - " + e))
				.collect(Collectors.toList());
		System.out.println(wordWithInt);

	}

}
