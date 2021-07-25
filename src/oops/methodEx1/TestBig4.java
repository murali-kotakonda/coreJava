package methods;

import java.util.Scanner;

public class TestBig4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
		int n1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int n2 = sc.nextInt();
		
		System.out.println("Enter num3");
		int n3 = sc.nextInt();
		
		System.out.println("Enter num4");
		int n4 = sc.nextInt();
		
		// create object for Operations
		Operations op = new Operations();
		
		
		//approach-1
		int big =  op.big( n1 , op.big( n2 , op.big(n3, n4))) ;
		System.out.println("Big ="+big);
		
		//approach-2
		int x = op.big(n1, n2);
		int y = op.big(n3, x);
		big = op.big(n4,  y);
		System.out.println("Big ="+big);
		 
	}
}
