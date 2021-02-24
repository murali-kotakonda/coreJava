package oops.methods.passValues;

public class TestPassByValue {
	
	public static void main(String[] args) {
		int x= 10;
		
		System.out.println(x); 
		
		modify(x);
		
		System.out.println(x); 
	}
	
	
	private static void modify(int num){ 
		num = 90;
	}
	
}	
	
	// int num = x , the value of 10 is assigned to num
	
	
	// if method1() calls method2() by passing primitive variables [int/float/long/double.etc..] 
	 //if the method2() is modifying primitive variable , then it will not have impact on method1()
	
	
	
	
	
	/*
	  
local variables:
 - variables created inside the function.
 
 main() :
  local variable is  x
    
 modify():
    local variable is num
	  int x= 90;
	  
	  System.out.println(x); 
	  
	  int num =x;
	  System.out.println(num);
	  num =45;
	  System.out.println(num);
	   
	  System.out.println(x);
	 
	  
	 */

