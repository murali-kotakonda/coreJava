package datatypes;

public class DataTypes {
	
	public static void main(String[] args) {
		// create varibales for every data type
		/*
		 
		  Datatype: specifies the type of the data.
		  ex: number or text or decimal 
		  develper has to specify the type of the data before processing.
		  
		 
		  
		  variable: memory name given by developer that holds the data.
		  - a varible should be created by specifying the data type.
		  
		  - for processing data , the data should be hold using a variable
		  - the variable is created using data type.
		  
		   Data Types provided by java:
		   ----------------------------------
	 
		 Type                memory
		 1.Byte                1 Byte
		 
		 [Numbers]
		 2.short               2 bytes    -32768 TO 32768
		 3.int                 4 bytes
		 4.long                8 bytes
		 
		 [Decimals]
		 5.float               4 bytes  (SMALLER DECIMAL UPTO 7 dgits)
		 6.double              8 bytes   (bigger decimal upto 15 digits after .)
		 
		 [characters]
		 7.char                2 bytes only 1 char   [0-9][a-z][A-Z] [.,!@#$%^&*()_/etc...]
		 8.string              based on no of chars  GROUP OF CHARS
		 
		 9.boolean             true/false 1 bit
		 
		 */
		
		//creatre varible for data type
		
		
		short a = 12;  //short is data type , a is variable and 12 for the variable
		//declaration + initilization
		
		int b;  // declaration
		b=90;   // assignment   [ int b =90 ]
		b=100; // assignment
		
		long c =131313131313133113L;// ENDS WITH l
		
		
		float d = 12.24241313F ; // ENDS WITH F
		double e = 131313131.131321321313143D; // ends with d
		
		char f = '$';  // [0-9] [a-z] [A-Z] [!@#$%^&*()_+..... ] char can hold only one char   ; char requires single quote
		String g = "hello my name is kumar"; // group of characters in double quote
		
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
