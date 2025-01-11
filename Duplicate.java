package com.task2.arrays;

import java.util.Arrays;


public class Duplicate {

	public static void main(String[] args) {

		int a[]= {1,2,3,2,3,4,5,5,6,7,8,9};
		
		System.out.println("Array- "+Arrays.toString(a));
		
		int m[]=Arrays.stream(a)
				.distinct()
				.toArray();
		
		System.out.println("After removal of duplicate- "+Arrays.toString(m));
		
		
	}

}
