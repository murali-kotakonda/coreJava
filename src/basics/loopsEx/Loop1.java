package basics.loopsEx;

/**
  Loops/Iteration:
  ------------------
  - execute same code multiple times but every time on different data until the 
    condition is satisfied.
  
  In Java we have 3 types of loops :
  ->for 
  ->while 
  ->do while
  
 */


/**
  print hello for 10 times
 */

public class Loop1 {

public static void main(String[] args) {
	
	for( int i= 1; i <=10 ; i= i+1) {
		System.out.println("hello");
	}
	
	
}
	
}

/*
for loop requires below 3 sections:
initialization          int i=1;         - 1 time 
condition               i<=10;           - every time before for block
increment/decrement     i++;             - every time after the for block
* */




