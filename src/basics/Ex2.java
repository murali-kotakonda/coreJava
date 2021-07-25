package basics;

	// single line comment
	//
	
	/*
	 * 
	 * multi line comment
	 * 
	 */
/**
 variable:
 hold the real time static/dynamic data.
 create a variable using the data type.
 memory allocation/processing for the data depends on TYPE of data ..
 
 datatypes : [type of the data ].
  - Every Variable is created by specifying the datatype.
	
		     datatype           size (in bytes)
		 ----------------------------------------------  
		 byte               1    ( byte is the DT that represents any Data type )
		                          when we need to communicate with third party.
		 						               ex: DB, FILE, WEB etc...
		 [natural numbers]
		 short              2      -32768 to 32767                                    
		 int                4      number
		 long               8      bigger number
		 
		 [decimal numbers]
		 float              4      -> decimal
		 double             8      -> bigger decimal
		 
		 char               2           
		 String             depends on no of chars
		 
		 boolean            1 bit    -> true/false 
		 
		  	
How to create a variable?
 solution)
 
 <data-type> <variable-name>;
 
  
 How to declare a variable?
 solution:

 //declaration
 int x;
 float y;
 long z;

How to assign a value to variable?
int x; // declaration
x = 90; //assigning value





int x =90 ; //declartaion + initializing value
*/
public class Ex2 {

public static void main(String[] args) {
	short a =  90;
	
	int b = 131313131;
	long c=2424242424242424242L;
	
	float d =131313.24242f;
	double e =12424245245.32532532535353d;
	
	char f ='9';
	String g ="hello kumar welcome to java programing! 1";
	
	boolean h = true;
	boolean i = false;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	System.out.println(i);
	
	
	
	
	
	
}
}
