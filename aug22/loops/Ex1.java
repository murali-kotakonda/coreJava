package loops;

/**
  Loop/iteration:
  Execute same code for multiple runs but with different data in very run, until the  condition is satisfied.
  
   loops in java:
   -----------------------
   FOR
   WHILE
   DO WHILE
  
  
  Req: print "hello" for 50 times
  
 */
public class Ex1 {
public static void main(String[] args) {
	
	for(int i=1 ; i<=50 ; i++) {
		System.out.println("Hello");
	}
	/*
	 
	 For loop has 3 sections:
	-> init :  
	 		int i=1 ;
	        executed one time before the body
	 
	 ->condition :
	 		i<=50 ;
	 		executed every time before the body
	 		if condition is satisfied , execute the body
	 		if condition is not satisfied , exit the for loop
	 
	 ->increment/decrement :
	 		i++ [ i= i+1 ] 
	 		executed every time after the body
	 
	 * */
}
}
