package loops;


/**
 Reverse a string
 
 i/p: kumar  
 
 str1 = "kumar";
 
 find length of str:
 ->int len = str1.length();
 	
 str1[4]  -> r
 str1[3]  -> a
 str1[2]  -> m
 str1[1]  -> u
 str1[0]  -> k
 
 str1.charAt(<number>) -> fetches you the character at the position number
 
 o/p: ramuk
*/

import java.util.Scanner;

public class Loop15ReverseString {
	public static void main(String[] args) { 
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a string: ");
		String str1 = sc.next();
		String reverse = "";
		int len = str1.length();
		for(int i=len-1 ; i >=0 ; i--) {
			reverse = reverse + str1.charAt(i);
			//System.out.println(str1.charAt(i));
		}
		System.out.println(reverse);
	}
}
