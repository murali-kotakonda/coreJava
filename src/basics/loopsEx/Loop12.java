package basics.loopsEx;

import java.util.Scanner;

/**
While loop:
-use while loop when we dont know the number of  itereations/runs/size.
-every for loop cna be converted to while loop
- for while loop only condition is mandatory ; others are optional

for loop:
use for loop if  we know the no of itereations/runs/size.

*/

public class Loop12 {
public static void main(String[] args) {
  //print numbers from 1 to 100	
	int i= 1; //init
	 
	while( i <=100 ) { //condition
		System.out.println(i);
		i= i+1 ; // increment
	}
	
}
}

