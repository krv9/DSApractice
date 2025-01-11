package com.task2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Kth value- ");
		int k=sc.nextInt();
		k=k%a.length;
		for (int i = 0; i < k; i++) {
            int m = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1]; 
            }
            a[0] = m; 
        }
		System.out.println("After rotation- "+Arrays.toString(a));
		
		sc.close();
	}

}
