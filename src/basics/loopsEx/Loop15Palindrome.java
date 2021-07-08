package loops;


/**
 Reverse a string
 
 i/p: abcba  
 
 o/p: abcba
 
 reverse value == original value  ====> palindrome
*/

import java.util.Scanner;

public class Loop15Palindrome {
	public static void main(String[] args) { 
		//take input
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a string: ");
		String str1 = sc.next();

		//find the reverse value
		String reverse = "";
		int len = str1.length();
		for(int i=len-1 ; i >=0 ; i--) {
			reverse = reverse + str1.charAt(i);
			//System.out.println(str1.charAt(i));
		}
		
		//check
		if(str1.equals(reverse)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
	}
}
