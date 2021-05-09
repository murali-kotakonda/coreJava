package basics.loopsEx;

import java.util.Scanner;

/**
dont take any size as input
take words as input continuosly.
find word value == 'END' then stop the program
and print all the words

solution):
use while loop as we dont know the number of runs.

*/
public class Loop19 {
public static void main(String[] args) {
	int sum =0;
	Scanner sc = new Scanner(System.in);
	
	String word ="";
	String finalWords= "";
	while(!word.equals("END")) {
		finalWords = finalWords + " " +word ;
		System.out.println("Enter word: ");
		word = sc.next();
	}
	
	System.out.println("finalWords = " + finalWords);
}
}
