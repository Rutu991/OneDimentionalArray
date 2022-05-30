package com.demo.example;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = new String[] {"cat", "dog", "bird", "9", "10"};
	    String[] b = new String[] {"cat", "dog", "bird", "9","10"};
	    //String c [] = Arrays.copyOf(b);  //no suitable method found for copyOf(String[])
	    System.out.println(Arrays.equals(a,b));  //compare contents
	    System.out.println(a.equals(b));  //array didn't override Object class's equals method
	    for(String s: a) System.out.println(s);
	    Arrays.sort(a);  //sort by alphabetic order
	    for(String s: a) System.out.println(s);
	    System.out.println(Arrays.binarySearch(a, "dog"));  //sorted
	    System.out.println(Arrays.binarySearch(b, "dog"));  //unsorted, unpredicatable result
	    System.out.println(Arrays.binarySearch(a, "nosuchthing"));  //sorted
	    System.out.println(Arrays.binarySearch(b, "nosuchthing"));  //unsorted, unpredicatable result
	  }

	}


