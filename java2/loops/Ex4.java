package loops;

import java.util.Scanner;

/**
  take size as input
  print even nos from 1 to the input
 */
public class Ex4 {

	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		System.out.println("******************* Approach-1 *************************");
		for(int i=2; i<=size; i = i+2){
				System.out.println(i);
		}
		
		System.out.println("******************* Approach-2 *************************");
		for( int i=1 ; i<= size; i++){
		     if( i%2 == 0) {
		        System.out.println(i);
		      }
		      
		    }
		     
	}
}
