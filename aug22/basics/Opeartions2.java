package basics;

/**
 *
 Perform add, mul , sub , div , remainder for two integers
 print output in same line
 */
public class Opeartions2 {

	public static void main(String[] args) {
		int n1= 120;
		int n2 = 30;

		int sumValue = n1 + n2; //add
		int sub= n1- n2;  // sub
		int div = n1/n2; // quotient 
		int mul = n1* n2; // mul
		int rem = n1%n2; // remainder 
		
		// use '+' for joining multiple values
		System.out.println("addition result = " + sumValue +
						    " sub result = " + sub +
						    " div result = " + div +
						    " mul result = " +mul +
		                    " rem result = " + rem );
	}
	
}


// assignment : 

//Perform add, mul , sub , div , remainder for two float
//Perform add, mul , sub , div , remainder for two long
//Perform add, mul , sub , div , remainder for two double




