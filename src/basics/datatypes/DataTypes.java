package basics.datatypes;

public class DataTypes {
public static void main(String[] args) {
	/*
	//variables : hold the real time static/dynamic data
		//memory allocation/processing for the data depends on tyep of data ..
		
		
		//datatypes : [type of the data ]. EVERY Variable is created by specifying the datatype.
		
		/*
		 datatype           size (in bytes)
		 ----------------------------------------------  
		 byte               1    ( byte is the DT that represents any Data type )
		                          when we need to communicate with third party.
		 						ex: DB, FILE, WEB etc...
		 
		 short              2      -32768 to 32767                                    
		 int                4      number
		 long               8      bigger number
		 
		 
		 float              4      -> decimal
		 double             8      -> bigger decimal
		 
		 char               2           
		 String             depends on no of chars
		 
		 boolean            1 bit    -> true/false  
	
	byte:
		This can hold whole number between -128 and 127. 
	Default size of this data type: 1 byte.	
	
	
	short:
			This is greater than byte in terms of size and less than integer. 
			Its range is -32,768 to 32767.
	Default size of this data type: 2 byte
	
	int: Used when short is not large enough to hold the number,
	 it has a wider range: -2,147,483,648 to 2,147,483,647
	Default size: 4 byte
	
	
	long:
		Used when int is not large enough to hold the value, 
		it has wider range than int data type, ranging 
		from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
		size: 8 bytes
		
		
	double: Sufficient for holding 15 decimal digits
		size: 8 bytes
		
		
	float: Sufficient for holding 6 to 7 decimal digits
		size: 4 bytes
		
		// how to create a varaible datatype + variable name
		
		
		rules for variable names
		1.[a-z[A-Z][0-9] [ _ $ ]
		2.start with alphabet or _ or $ , but not with number. 
		cannot use the java reserved keywords 
	
			*/
		short a = 23; // a is a varibale of short data type with 23 a s value
		// declaration of variable + assignment of value

		int b; // declaration of variable
		b = 1313; // assign the values

		long c = 9052424242422424242L;
		float d = 89.1313131f;
		double e = 24242424422424.24242424242424d;

		char f = '6'; // 1 single char [0-9] [a-z] [ A-Z] [!@#$%^&*()<>?:"{}....]
		String g = "my name is krishna. iam a java developer@ 1234 ";

		boolean h = false;
		boolean m = true;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(m);

		// print all varible values in one line seperated by comma
		String joinData = a + " ," + b + " , " + c;
		System.out.println(joinData);// print all varibale values in line

		// o/p:value of a = 23 , value of b = 1313 , value of c = 9052424242422424242L
		// ..etc........................

}
}
