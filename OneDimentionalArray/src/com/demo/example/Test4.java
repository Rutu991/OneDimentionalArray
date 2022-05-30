package com.demo.example;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a, b = 3, c[];
		    c = new int[3];
		    //a = new int[3]; //not compile
		    a = 2;

		    int[] d, e, f = {2,3}, g;
		    d = e = f;
		    List<int[]> m = Arrays.asList(f);
		    //List<Integer> m = f.asList();  //not comile
		    //d = 2; //not compile
		    //g = args;  //not compile    
		    String[] h = args;
		    h[0] = "change parameter";
		    //System.out.println(h.capacity);  //not compile
		    //System.out.println(h.capacity());  //not compile
		    for(String arg: h) System.out.println(arg);
		    args = null;
		    for(String arg: h) System.out.println(arg);
		  }
		

	}


