package methods;

public class Operations {

	// method with no retun type and no input args
	//public : scope
	// void : no return type
	
	public void show() {
			System.out.println("helloo welcome to show");
			System.out.println("bye.....");
	}
			
	//method with no return type and 1 input arg [String]
	 public void printName(String data) {
		 System.out.println("Mr/Mrs " + data);
	 }
	 
	  
	 
	//method with no return type and 2 input arg [int, int]
	 public void sum(int x , int y) {
		 //here x, y and z are local variables
		 int z = x+y;
		 System.out.println("sum is :: "+z);
	 }
	 //local variables : varibales creatd inside the method
	 
	 
	 
	 	 
	 
	 
	 
	 
	 //,method with a return value[string] and no input args
	 // one method can return only one value
	 //return statement is mandatory
	 public String getData() {
		 return "welcome to data";
	 }
	 
	 
	 	 
	 
	 //,method with a return value[string] and 1 input arg[String]
	 public String process(String name) {
		 return "Hello My Dear "+name;
	 }
	 
	 
	 
	//,method with a return value[1] and 2 input arg[int]
	 public int big(int x , int y) {
		 if(x>y) {
			 return x;
		 }
		 else {
			 return y;
		 }
	 }
	 
	 
	 
	 
}














/*

  ex: println()
      sc.next()
      sc.nextInt()
      sc.nextFloat()
      
  
  method: group of logic
  adv : code reusability
 
syntax for writing the method:

<scope> <return_type> <method_name> (input args){

 <method body>

 
 <return statment>
}

scope : public or private
return_type : datatype of the value returned by method
return_type wil be void if there is no return value
input args : optional




 * */
