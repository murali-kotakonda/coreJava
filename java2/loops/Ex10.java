package loops;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		

		for(int i=1; i<=size;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}
	
	/*
	  i is for row   ; condition for i should run for size no of times
	  j is for column ; condition for  
	  
	  [i]
	  1   1
	  2	  1 2
	  3	  1 2 3
	  4   1 2 3 4
	  5   1 2 3 4 5
	  
	  
	  
	 * */
	
}
