package other;

public class Ternanry {
	public static void main(String[] args) {
		int age=90;
		if(validateAge(age)) {
			System.out.println("valid age");
		}
		else {
			System.out.println("invalid age");
		}
	}
	
	
	public static boolean validateAge(int age){
		/*if(age>18){
			return true;
		}
		return false;*/
		return age>18?true:false;
	}
	
	public static boolean validateAge1(int age){
		 if(age>18){
			return true;
		}
		return false; 
	}
}


/*
 Ternary operator:
---------------------

Req :
write a function that returns boolean.
if age  > 18 return true
if age  < 18 return false

//approach1
public   boolean validateAge(int age){
		boolean valid;
		 if(age>18){
			valid = true;
		}else{
      valid = false;
    }
		return valid; 
	}
  
  
  
//approach2:
public  boolean validateAge(int age){
		boolean valid =  age>18?true:false;
    return valid;
}

syntax:

<condition> ? <true value> : <false value> ;
 age>18    ?  true  :  false

  
 * */
