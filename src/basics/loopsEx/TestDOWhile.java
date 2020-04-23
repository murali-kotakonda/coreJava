package basics.loopsEx;

import java.util.Scanner;

public class TestDOWhile {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum =0;
	int input= 0;
	while(input>=0){
		System.out.println("enter number [ negative number to stop ]");
		input = sc.nextInt();
		if(input>0){
			sum = sum + input;
		}
	}
	System.out.println(sum);
}
}
