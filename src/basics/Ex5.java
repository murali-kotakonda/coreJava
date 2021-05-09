package basics;

/**
 Req: 
 take the input for int, long, float, double , string datatypes
 and print values.
 
 
 Steps for taking input from command prompt:
-------------------------------------------
1. //create a scanner object
Scanner sc = new Scanner(System.in);
//sc is a scanner object	
 
2.How to take word as input?
String word = sc.next();

3.How to take sentence as input?
String n6 = sc.nextLine();
	

4.How to take int as input?
int n1 = sc.nextInt();

5.How to take long as input?
long n2 = sc.nextLong();

	
6.How to take float as input?
float n3 = sc.nextFloat();

7.How to take double as input?
double n4 = sc.nextDouble();	
	
 */


import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the WORD");
		String s2 = sc.next();
		
		System.out.println("Enter the int");
		int a  = sc.nextInt();
		
		System.out.println("Enter the long");
		long b = sc.nextLong();
		
		System.out.println("Enter the float");
		float c = sc.nextFloat();
		
		System.out.println("Enter the double");
		double d = sc.nextDouble();
		
		System.out.println("*****************Your data = ***********************");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	}
}
