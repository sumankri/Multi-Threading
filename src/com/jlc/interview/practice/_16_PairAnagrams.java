package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _16_PairAnagrams {

	public static void main(String[] args) {

		// Group /Pair anagrams from a list of Strings

		String[] s = { "pat", "tap", "pan", "nap", "Team", "tree", "meat" };

		// o/p = [[pat,tap],[pan,nap],[Team,meat],[tree]

		Arrays.stream(s)
				.collect(Collectors.groupingBy(
						st -> Arrays.stream(st.toLowerCase().split("")
						).sorted().collect(Collectors.toList())
				)).entrySet().stream()
				.forEach(em-> System.out.println(em.getValue()));


	}

}
