package basics;

import java.util.Scanner;

public class InputProgs {
	
public static void main(String[] args) {
	
	
	/*
	 Take input from console/command prompt
	 
	  1.Create a Scanner object
	 
	  2.using the scanner obj read the inputs for any data type :
	  nextInt()
	  nextFloat()
	  nextDouble()
	  nextLong()
	  next() or nextLine()
	  
	  Prog(varible)  -------->SCANNER ---------> CONSOLE (data)
	 */
	
	// 1.Create a scanner object (java.util)
	Scanner sc = new Scanner(System.in);  //syntax for scanner obj creation
	
	System.out.println("enter ANY integer");
	int a=sc.nextInt();
	
	System.out.println("enter a float");
	float b= sc.nextFloat();
	
	System.out.println("enter any str");
	String c =sc.next();
	
	System.out.println("enter any long");
	long d =sc.nextLong();
	
	System.out.println("enter any double");
	double e =sc.nextDouble();
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
}
}
