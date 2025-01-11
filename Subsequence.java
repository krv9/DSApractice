package com.task2.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

		public class Subsequence { 
			public static List<Integer> find(int[] arr) {
		    int n = arr.length;
		    int[] dp = new int[n];
		    int[] prev = new int[n];
		
		    for (int i = 0; i < n; i++) {
		        dp[i] = 1; 
		        prev[i] = -1; 
		    }
		
		    int max = 1;
		    int last = 0;
		
		    for (int i = 1; i < n; i++) {
		        for (int j = 0; j < i; j++) {
		            if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
		                dp[i] = dp[j] + 1;
		                prev[i] = j; 
		            }
		        }
		        if (dp[i] > max) {
		            max = dp[i];
		            last = i;
		        }
		    }
		
		    List<Integer> lis = new ArrayList<>();
		    for (int i = last; i != -1; i = prev[i]) {
		        lis.add(0, arr[i]); 
		    }
		
		    return lis;
		}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> lis = find(arr);
        System.out.println("Longest Increasing Subsequence: " + lis);
        System.out.println("Subsequence count for this Array is "+lis.size());
        sc.close();
    }

   
}
