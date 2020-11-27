package datatypes;

public class DataType1 {

	public static void main(String[] args) {
		//process the data of different zones/types. ex: numbers, text, decimals.etc..
		/*
		 Datatypes supported in java:
		 variable : storage name, where java holds the data/real-time/info.
		 every varible should be created by mentioning the datatype.
		 
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
		 
		 
		 * */
		//create variables for every data type
		
		//declaring variable 
		short a = 89; // a is a variable of short datatype.  89 is the value associated with the variable 'a'
		System.out.println(a);
		
		int b = 600000;// b is a variable of int datatype.; 60000 is the value for b
		System.out.println(b);
		
		long c =2424242424242L;
		System.out.println(c);
		
		float e =2132.24242424F;
		System.out.println(e);
		
		double f=2424242.2424256487d;
		System.out.println(f);
		
		char g ='&'; // char should contain single quote
		String h ="my name is krishna" ; // use double quote for strings
		
		System.out.println(g);
		System.out.println(h);
		
		boolean a1= true;
		boolean a2=false;
				
		System.out.println(a1);
		System.out.println(a2);
		
	}
	
}
