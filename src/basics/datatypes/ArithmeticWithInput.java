package basics;

import java.util.Scanner;

public class ArithmeticWithInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 : ");
		int x = sc.nextInt();
		
		System.out.println("Enter num2 : ");
		int y =sc.nextInt();
		
		// perform add, sub , mul , div  
		
		int sum = x + y;
		int sub = x - y;
		int mul = x * y;
		int div = x/y;
		
		//print
		System.out.println("Sum = "+ sum);
		System.out.println("sub = "+ sub);
		System.out.println("mul = "+ mul);
		System.out.println("div = "+ div);
		
	}
	
}
