package com.task2.arrays;
import java.util.Scanner;

public class Fibonacci {

    public static long fib(int n) {
        if (n == 0) { 
        	return 0;
        	}
        if (n == 1) {
        	return 1;
        }

        long a = 0;
        long b = 1;
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value - ");
        int n = sc.nextInt();

        System.out.println("Fibonacci value for " + n + " is  " + fib(n));
        sc.close();
    }
}
