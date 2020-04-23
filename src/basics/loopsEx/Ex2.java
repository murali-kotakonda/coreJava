package basics.loopsEx;

import java.util.Scanner;

public class Ex2 {
public static void main(String[] args) {
	System.out.println("enter size");
	Scanner sc = new Scanner(System.in);
	int size= sc.nextInt();
	
	int big =0;
	for(int i=1;i<=size;i++) {
		System.out.println("enter num");
		int num = sc.nextInt();
		if(num>big) {
			big = num;
		}
		
	}
	System.out.println(big);
}
}
