package com.jlc.interview.practice;

public class ReverseStringWithoutLibraryFun {

	public static void main(String[] args) {

		// reverse a string without using library function
		
		String sentence = "My name is suman kumari";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=sentence.length()-1;i>=0;i--) {
			sb.append(sentence.charAt(i));
		}
		
		System.out.println(sb.toString());
	}

}
