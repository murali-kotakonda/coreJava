package basics;

import java.util.Scanner;

public class TestDataTypesWithInput {
	public static void main(String[] args) {
		//create scanner obj
		Scanner  sc =  new Scanner(System.in);
		
		System.out.println("enter int");
		int n1= sc.nextInt();
		System.out.println("enter long");
		long num2 = sc.nextLong();
		
		System.out.println("enter float");
		float sal= sc.nextFloat();
		
		System.out.println("enter double");
		double sal2 = sc.nextDouble();
		
		System.out.println("enter string");
		String name =sc.next();
		
		System.out.println("############input data is############");
		//syso 
		System.out.println(n1);
		System.out.println(num2);
		System.out.println(sal);
		System.out.println(sal2);
		System.out.println(name);
		
		name = "bye  bye";
		System.out.println(name);
		
		int z = 6;
				
	}
}
