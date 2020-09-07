package oops.methodEx1;

/**
  create methods.
  
  call methods.
  
  sytax:
  
  <scope> <return+type> <method_name> (<input args> ) {
     <method body>
     <return statement>
  }
  
  method:
     group of statements/code.
     
  Adv:
  code reusability.
  write code once and reuse any no of times.
     
     
 */
public class Opearations {

	//with no input and no return type
	public void show() {
		System.out.println("inside show method");
	}
	
	//method with string input
	public void process(String s){
		String m = "Mr/Mrs " +s;
		System.out.println("res = "+m);
	}
	
	//method with int
	public void addTen(int x) {
		x = x + 10;
		System.out.println(x);
	}
	
	// funtion with two inputs
	public void sum(int x, int y) {
		int sum = x + y;
		System.out.println("sum= " + sum);
	}
	
	
	// void : no return type
	// one method can retun only one value.
	//funtion that retuns int
	public int getData() {
		int x =90;
		return x;	
	}
	
	//funtion with str as return type
	public String getMsg() {
		return "Registraion success";
	}
	
	// method with i/p args and return value
	public int add(int x, int y) {
		int res  = x+ y;
		return res;
	}
	
	//call methods within class
}














