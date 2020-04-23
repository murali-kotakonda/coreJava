package oops.staticMethods;

public class Dao {

	static int count =900;
	public static void showCount(){
		System.out.println(count);
	}
	
	public static void updateCount(int increment){
		count= count+ increment;
	}
}
