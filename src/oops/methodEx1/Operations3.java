package oops.methodEx1;
/*
 * 
 * method:
  write code one time and reuse any number of times
  
-> how to write method
-> how to call the method

  
syntax for a method:
------------------------
<scope> <return type> <methodname> (<input args>){
  
  <mehod body>
  
  
  <return statement>
}

scope -->public/private/protected
returnType -> void(no return ) or int/float/long/.....etc
<methidname> -> ann name
<input args> are optionl
<return statement> -> is manadatory if returnType is not void


 */
public class Operations3 {

	public void sum(int num1 , int num2){
		int sum= num1+num2;
		System.out.println("sum == "+sum);
	}
	
	public void sub(int num1 , int num2){
		int sub= num1-num2;
		System.out.println("sub == "+sub);
	}
	
	public void mul(int num1 , int num2){
		int mul= num1*num2;
		System.out.println("mul="+mul);
	}
	
	public void div(int num1 , int num2){
		int div= num1/num2;
		System.out.println("div == "+div);
	}
	
	public void sayHi(){
		System.out.println("hiiiiii");
	}
	
}
