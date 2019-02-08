package staticMethods;


public class Service {
	//instance varible
	String id;
	
	//static variable
	static double count = 1000d;
	

	public void validate(){
		System.out.println(id);
		show();
		
		System.out.println(count);
		display();
	}

	public void show(){ 
		System.out.println("inside  display2");
	}

	
	public static void handle(){
		//System.out.println(id);
		//show();
		
		System.out.println(count);
		display();
	}
	
	
	public static void display(){
		System.out.println("in static getData2");
	}
	
		
}
