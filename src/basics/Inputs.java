package basics;

import java.util.Scanner;

/**
Req: 
take the input for int, long, float, double , string datatypes
 and print values.
 
 
Steps for taking input from command prompt:
-------------------------------------------
1. //create a scanner object
		Scanner sc = new Scanner(System.in);
 
2.How to take word as input?
String n5 = sc.next();

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

public class Inputs {

	public static void main(String[] args) {
		
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a sentence");
		String n6 = sc.nextLine();
		
		System.out.println("enter a word");
		String n5 = sc.next();
		
		System.out.println("enter int");
		int n1 = sc.nextInt();
		
		System.out.println("enter long");
		long n2 = sc.nextLong();
		
		System.out.println("enter float");
		float n3 = sc.nextFloat();
		
		System.out.println("enter double");
		double n4 = sc.nextDouble();
		
		System.out.println("int =" + n1);
		System.out.println("long =" + n2);
		System.out.println("float =" + n3);
		System.out.println("double =" + n4);
		System.out.println("word =" + n5);
		System.out.println("sentence  =" + n6);
	}
}