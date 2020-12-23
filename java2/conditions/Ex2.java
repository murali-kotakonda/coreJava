package conditions;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		//take two nums as input and find the small num
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter num1");
		int n1 = sc.nextInt();

		System.out.println("enter num2");
		int n2 = sc.nextInt();
		
		  
	    if( n1  >  n2){
	    	System.out.println("smaller = " + n2);
	    }else{
	   		 System.out.println("smaller = " + n1);
	    }
	    
	     if( n1  <  n2){
	    	System.out.println("smaller = " + n1);
	    }else{
	   		 System.out.println("smaller = " + n2);
	    }
	}
	/*
	   int/float/long/double
	   --------------------------
	    ==
	    !=
	    >
	    >=
	    <
	    <=
	      
	 * */
}