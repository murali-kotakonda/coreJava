package basics;

public class Ex3 {

	public static void main(String[] args) {
			
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
		   
		 */
		
		// how to create a varaible datatype + variable name
		
		
		/*
		rules for variable names
		1.[a-z[A-Z][0-9] [ _ $ ]
		2.start with alphabet or _ or $ , but not with number. 
		cannot use the java reserved keywords 
		 */
		
		short a= 23;   // a is a varibale of short data type with 23 a s value
		              // declaration of variable + assignment of value
		
		int b; // declaration of variable
		b= 1313 ; // assign the values
		
		long c =9052424242422424242L;
		float d = 89.1313131f;
		double e = 24242424422424.24242424242424d;
		
		
		
		char f ='6' ; // 1 single char  [0-9] [a-z] [ A-Z] [!@#$%^&*()<>?:"{}....]
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
		String joinData = a + " ," + b  + " , "+ c;
		System.out.println(joinData);//print all varibale values in line 
		
		//o/p:value of a = 23 , value of b = 1313 , value of c = 9052424242422424242L ..etc........................
		
	}
}
