package basics.loopsEx;

import java.util.Scanner;

public class EvenOdd2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number:");
	
	int num= sc.nextInt();
	
	System.out.println("Even Numbers:");
	print(2,num);
	
	System.out.println("\n\nOdd Numbers:");
	print(1,num);
}

private static void print(int start,int num) {
	for(int i=start;i<=num;i=i+2){
		System.out.print(i+" ");
		
	}
}
}
