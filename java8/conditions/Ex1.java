package conditions;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//
		// 1.if , 
		//2. if + else   3. if + else if           4. switch          5.ternany operator   6. nested condtions
		/*
		  if(<condition>) {
		  
		  
		  }
		   a, b are two variables               x,y are two strings
		   <condition>   
		    nums:                  
		    a == b                                 x==y
		    a != b                                 x!=y
		    a > b
		    a < b
		    a >= b
		    a <= b
		     		   
		 */
		
		Scanner sc = new Scanner(System.in);  //syntax for scanner obj creation
		
		System.out.println("enter  integer 1" );
		int a=sc.nextInt();
		
		System.out.println("enter  integer 2");
		int b= sc.nextInt();
		
		
		if(a == b) {
			System.out.println("nums are equal");
		}else {
			System.out.println("nums are not equal");
			
		}
	}
}
