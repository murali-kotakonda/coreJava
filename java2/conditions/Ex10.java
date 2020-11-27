package conditions;

import java.util.Scanner;
/**
 * @author I335484
 * take 3 nos as input and find the small no
 */
public class Ex10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter num1");
		int n1 = sc.nextInt();
		
		System.out.println("enter num2");
		int n2 = sc.nextInt();
		
		System.out.println("enter num3");
		int n3 = sc.nextInt();
		
		int small = n1; // keep n1 inside small 
		
		//compare n2 & big
		if(n2<small) {
			small = n2;
		}

		//compare n3 & big
		if(n3<small) {
			small = n3;
		}
		
		System.out.println("small  = "+small);
	}
	
}




