package com.task2.arrays;

import java.util.Arrays;

public class Coinchange {

	
	static int coin(int sum,int a[],int dp[]) {
		if (sum==0) {
			return 0;
		}	
		int ans=Integer.MAX_VALUE;
		for (int i=0; i<a.length; i++) {
	
			if(sum-a[i]>=0) {
				int sub=0;
				if(dp[sum-a[i]] !=-1) {
					sub=dp[sum-a[i]];
				}
				else{
					sub=coin(sum-a[i],a,dp);
				}
					if(sub!=Integer.MAX_VALUE && sub+1<ans) {
					ans=sub+1;
				}
			}
		}
		return dp[sum]=ans;
	}
	
	public static void main(String[] args) {
		int sum=11;
		int a[]= {1,4,5,6,7};
		int dp[]=new int[sum+1];
		Arrays.fill(dp,-1);
		dp[0]=0;
		int ans=coin(sum, a,dp);
		System.out.println("output for array- "+ans);
	}

}
