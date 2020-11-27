package oops.staticMethods;

public class Dao2 {

	//instance method
	public void show() {
		System.out.println("hello from instance");
	}
	
	//static method
	public static void print(){
		System.out.println("hello from static");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int count =900;
	
	public static void showCount(){
		System.out.println(count);
	}
	
	public static void updateCount(int increment){
		count= count+ increment;
	}
	
	
}
