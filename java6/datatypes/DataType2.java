package datatypes;

public class DataType2 {

	public static void main(String[] args) {
		short a = 89; // a is a variable of short datatype.  89 is the value associated with the variable 'a'
		int b = 600000;// b is a variable of int datatype.; 60000 is the value for b
		
		long c =2424242424242L;
		float e =2132.24242424F;
		
		double f=2424242.2424256487d;
		
		char g ='&'; // char should contain single quote
		String h ="my name is krishna" ; // use double quote for strings
		
		boolean a1= true;
		boolean a2=false;
		
		//print the data in a single line , [join all data in a single line]
		//for joinng/append/concatenation we have to use the  + operation
		System.out.println(a  + " , " + 
							b  + " ,  " +
							c  + " ,  " + 
							e + " - " + 
							f + " - " +
							g + " - " +
							h + " - " +
							a1 + " - " +
							a2);
		
		System.out.println(" value of a is " + a);
		System.out.println(" value of b is " + b);
		System.out.println(" value of c is " + c);
		System.out.println(" value of e is " + e);
		System.out.println(" value of f is " + f);
		System.out.println(" value of g is " + g);
		System.out.println(" value of h is " + h);
		System.out.println(" value of a1 is " + a1);
		System.out.println(" value of a2 is " + a2);
		
	}
	
}
