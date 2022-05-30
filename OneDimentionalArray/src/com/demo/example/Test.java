package com.demo.example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringArr = new String[9];
	    int[] intArr = new int[3];  //initial value is 0,0,0, size is 3
	    //boolean[] booArr = new boolean[];  //array dimension missing
	    //String foo[] = new foo[2];  //array name is not a type
	    boolean[] booleanArr = new boolean[5];
	    Boolean    [] booArr1 = new Boolean[2];  //null, null, size is 2
	    Boolean booArr2 [] = new Boolean[4];
	    Boolean booArr3[] = new Boolean[2];  //false, false, size is 2

	    //initialize
	    int intArr2[] = new int[] {1,2,3};   //initial value is 1, 2, 3, size is 3
	    int[] intArr4 = new int[]{0,9,2};
	    int[] intArr1 = {1,3,5,7}; 
	    //char[] charArr = new Char[] {'a', 'b'};  //Char can not find symbol
	    //int intArr3  [] = new int[2]{1,2};  //not a statement
	    for(int i: intArr4) {
	      System.out.print(i+" ");
	    }
	    System.out.println();
	  }

	}


