package com.task2.LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class Middleelement {
	 
	public static int find(LinkedList<Integer> list) {
	        int a = 0; 
	        int b = 0; 
	        while (b < list.size() - 1) {
	            a++; 
	            b += 2; 
	        }
	        return list.get(a);
	    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value :- ");
        int n = sc.nextInt();

        LinkedList<Integer> m = new LinkedList<>();

        System.out.println("Enter values in the list :- ");
        for (int i = 0; i < n; i++) {
            m.add(sc.nextInt());
        }

        System.out.println("LinkedList: " + m);
        int middleElement = find(m);
        System.out.println("Middle element: " + middleElement);
        sc.close();
    }
  
}
