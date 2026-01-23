package com.jlc.interview.practice;

import java.util.Arrays;
import java.util.List;

public class SecondlargestNum {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(3,4,2,6,1,5);
		
		// second largest num
		
		int firstHighValue=0;
		int secHighValue=0;
		
		for(int i=0;i<num.size();i++) {
			if(num.get(i)>firstHighValue) {
				secHighValue=firstHighValue;
				firstHighValue=num.get(i);
			} else if(num.get(i)>secHighValue) {
				secHighValue=num.get(i);
			}
		}
		
		System.out.println("second high value - " + secHighValue);
		
	}

}
