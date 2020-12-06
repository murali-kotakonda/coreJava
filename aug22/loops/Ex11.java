package loops;

/**
  
  Req: print "hello" for 50 times
  
 */
public class Ex11 {
public static void main(String[] args) {
	
	int i=1; //init
	while(i<=50 ) { //condition
		System.out.println("Hello");
		
		i++; //increment
	}

	/*
	 while has only one mandatory:
	  ->condition :
	 		i<=50 ;
	 		executed every time before the body
	 		if condition is satisfied , execute the body
	 		if condition is not satisfied , exit the while loop
	 		
	 	init and increment are optional for while loop	
	  
	 
	 * */
}
}
