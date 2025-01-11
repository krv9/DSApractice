package com.task2.LinkedList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.*;

public class Mergelinkedlist {

	public static void main(String args[]) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("ria");
		l.add("sia");
		l.add("mia");
		System.out.println("first List is - "+l);
		LinkedList<String> m=new LinkedList<String>();
		m.add("jia");
		m.add("dia");
		m.add("kia");
		System.out.println("Second List is - "+m);
		String[] larr=l.toArray(new String[0]);
		Arrays.sort(larr);
		String[] marr=m.toArray(new String[0]);
		Arrays.sort(marr);
		String merge[]=Stream.concat(Arrays.stream(larr),Arrays.stream(marr))
				.toArray(String[]::new);
		Arrays.sort(merge);
		System.out.println("Sorted LinkedList merge- "+Arrays.toString(merge));
	
				
		}
	
}
