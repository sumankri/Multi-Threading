package com.jlc.interview.practice;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String word = "amama";
		int j=word.length()-1;
		boolean flag=true;
		
		for(int i=0;i<word.length()/2;i++) {
			if(word.charAt(i)==word.charAt(j)) {
				j--;
				
			}else {
				flag=false;
			}
			
		}
		System.out.println(flag);

	}

}
