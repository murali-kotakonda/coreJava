package loops;


/**
 Reverse a string
 
 i/p: abcba  
 
 size = 5
 
 0 == 4
 1 == 3
 2 == 2
 
 algorithm:
 0 char  == size-1
 1 char  == size-2
 2 char  == size-3
 5 char  == size -6
 
 i char  == (size-1)-i
 
 reverse value == original value  ====> palindrome
 
 case#1:
 abcdxba
compare 0 , 6
compare 1 , 5
compare 2 , 4
Not a palindrome

case#2:
abcdef
compare 0 , 5
Not a palindrome


*/

import java.util.Scanner;

public class Loop16Palindrome2 {
	public static void main(String[] args) { 
		//take input
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a string: ");
		String str1 = sc.next();

		//find the reverse value
		String status = "palindrome";
		int len = str1.length();
		for(int i=0 ; i <len-1 ; i++ ) {
			System.out.println("compare "+ i + " , "+ (len-i-1));
			if(str1.charAt(i) != str1.charAt(len-i-1)) {
				status = "Not a palindrome";
				break;
			}
		}
		System.out.println(status);
	}
}
