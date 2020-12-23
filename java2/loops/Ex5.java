package loops;

import java.util.Scanner;
/**
take size as input
print odd nos from 1 to the input
*/
public class Ex5 {

	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		System.out.println("******************* Approach-1 *************************");
	    for( int i=1 ; i<= size; i++){
	     if( i%2 != 0) {
	        System.out.println(i);
	      }
	   }
	   
	    System.out.println("******************* Approach-2 *************************");
	    for( int i =1; i<= 50 ; i = i +2){
	        System.out.println(i);
	    }
	     
	}
}
