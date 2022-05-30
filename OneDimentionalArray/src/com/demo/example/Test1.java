package com.demo.example;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = new Integer[]{1, 3, 4};
	    for(int i:a)System.out.print(i+"  ");
	    Integer[] b = a;  //now both a, b refer to the same array object
	    b[0] = 10;  //change object through b
	    System.out.println();
	    for(int i:a)System.out.print(i+"  ");
	    System.out.println(a.equals(b));  //true
	    System.out.println(a == b);  //true

	    Integer c[] = b.clone();  //c refer to a different array object
	    for(int i:c)System.out.print(i+"  ");
	    for(int i:b)System.out.print(i+"  "); 
	    System.out.print("c==b: ");  
	    System.out.println(c==b);  //false
	    System.out.print("c.equals(b): ");
	    System.out.println(c.equals(b));  //false
	    c[2] = 9;
	    for(int i:c)System.out.print(i+"  ");
	    for(int i:b)System.out.print(i+"  ");  //b didn't change
	    System.out.println(c.equals(b));  //false

	    b[2] = 9;
	    for(int i:a)System.out.print(i+"  ");
	    System.out.print("equals: ");System.out.println(c.equals(a)); //false
	    System.out.print("== compare referenced object:"); System.out.println(c==a);  //false
	    
	    //Long[] c = b; //incompatible types: Integer[] cannot be converted to Long[]
	    //Short d[] = b;  //incompatible types: Integer[] cannot be converted to Short[]
	    //int[] c = b;  //incompatible types: Integer[] cannot be converted to int[]
	  }
	

	}


