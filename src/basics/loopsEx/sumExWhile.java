package basics.loopsEx;

import java.util.Scanner;

public class sumExWhile {
public static void main(String[] args) {
	System.out.println("enter count");
	Scanner sc = new Scanner(System.in);
	int size= sc.nextInt();
	
	int sum= 0;
	int big=0;
	int small=0;
	for(int i=1;i<=size;i++){
		System.out.println("enter number:");
		int num = sc.nextInt();
		sum= sum+num;
		if(big<num) {
			big= num;
		}
		if(small>num) {
			small= num;
		}
	}
		/*
		 * int i=1; while(i<=size){ System.out.println("enter number:"); int num =
		 * sc.nextInt(); sum= sum+num; i++; }
		 * 
		 */	
	System.out.println("sum:" + sum);
	System.out.println("big:"+big);
	System.out.println("small:"+small);
}
}
