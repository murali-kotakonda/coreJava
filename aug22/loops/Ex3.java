package loops;

import java.util.Scanner;

/**
  Req: 
  Take size as input
  print numbers from 1 till the input
  
 */
public class Ex3 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size");
	int num = sc.nextInt();
	
	for(int i=1 ; i<=num ; i++) {
		System.out.println(i);
	}
}
}
