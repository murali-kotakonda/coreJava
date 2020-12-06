package conditions;

import java.util.Scanner;

/**

Conditional statements: deciding the branching of the code

if
if + else
if + else if
switch
ternary operator


int/float/long/double
-----------------------------------
==  -> equality
!=
>
>=
<
<=

Req:
take two nums as input


O/P: 
print "nums are equal" if both nums are same
print "nums are not equal" if both nums are not same

 */
public class Ex1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);// sc is a variable/object
	
	//create the scanner object
	System.out.println("enter num1");
	int n1 = sc.nextInt(); // store the value from console inside n1
	
	System.out.println("enter num2");
	int n2 = sc.nextInt();// store the value from console inside n2
	
	// == compare
	if ( n1 == n2) {
		
		System.out.println("nums are equal");
	}else {
		System.out.println("nums are not equal");
		
	}
		
}
}
