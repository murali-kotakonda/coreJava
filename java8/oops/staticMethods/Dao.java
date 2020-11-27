package oops.staticMethods;

public class Dao {

	//instance method
	public void show() {
		System.out.println("hello from instance");
	}
	
	//static method
	public static void print(){
		System.out.println("hello from static");
	}
	
	//static variable
	static int count =900;
	
	//static method - to print static value
	public static void showCount(){
		System.out.println(count);
	}
	
	//static method - alter static variable
	public static void updateCount(int increment){
		count= count+ increment;
	}
	
	
}
