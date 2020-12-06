package basics;

public class Datatypes {

	/*
	  DataTypes:
	  Dev has to specify the type of the data.
	  
	  primitive data types:
	  --------------------------
	  byte    - 1 bytes - use when dealing with 3rd party 
	  [file , i/o , db , web ]
	 
	  short   - 2 bytes  - Numbers , range is -32768 to 32767
	  int     - 4 bytes  - Numbers till 2147483647
	  long    - 8 bytes  - Numbers till 18 digits 
	  
	  float   - 4 bytes - decimal , 7 digits
	  double  - 8 bytes - decimal , 15 digits
	  
	  char    - 2 bytes , single char     0-9, a-z, A-Z , !@#$%^&*()<>,.
	  String  - group of chars, depends on no of chars
	  boolean - 1 bit , true/false [ memory is already created]
	   
	   
	  variable:
	  ------------------------------
	  variable holds the data.
	  variable requires memory allocation.
	  variable should be associated with the the data-type.
	  memory size for the variable depends on the data-type
	  
	  
	  
	  Rules for variable name:
	  - should start with alphabet
	  - digits are allowed
	  - only _ , $ are allowed
	  a-z , A-Z , 0-9 , _, $
	  
	  
	  
	  // - for single line comment
	   Req:
	  create  variable for all the datatypes and print
	   
	   
	 * */
	
	/* */ // multi line comment
	 public static void main(String[] args) {
		
		 int m;// declaring the variable ; 4 bytes of memory allocated
		 m = 90; // assigning the value 90 to m
		 
		 
		 int b = 12131313; // declaring and initializing the variable 
		 
		 short a = 12;
		 
		 long c = 321413131313L; // long value should end with l
		 
		 float d =1313.1313f; // float value should end with f
		 double e = 1313213135646.3535353D; // double value should end with D
		 
		 char f ='T' ;// CHAR value should be presented using single quotes
		 String g = "welcome to java programming" ;// string value hold be presented using double quotes
		 
		 boolean h= true;
		 boolean i = false;
		 
		 
		 System.out.println(m);
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 
		 System.out.println(d);
		 System.out.println(e);
		 System.out.println(f);
		 System.out.println(g);
		 System.out.println(h);
		 System.out.println(i);
		 
		 
		 //variable creation using _ , $ and digits
		 String first_name = "kumar";
		 String dollr$value ="122";
		 
		 
		 int data10 =445;
		 
	}
	  
	
	
}
