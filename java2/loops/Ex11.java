package loops;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		for(int i=0; i<size;i++) {
			int c = 1;
			for(int j=size;  c<=size-i     ;j--, c++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	
	/*
	  i is for row   ; condition for i should run for size no of times
	  j is for column ; condition for  
	  
5 4 3 2 1     (size-0)          
5 4 3 2       (size-1)
5 4 3         (size-2)
5 4           (size-3)
5             (size-4)

	  
	  
	 * */
	
}
