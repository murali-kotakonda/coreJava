package oops.staticMethods;


public class Service {
	//instance varible
	String dbName= "oracle";
	
	//static variable
	static double rateOfIntrest = 12.5d;
	
	public static void getData1(){
	//	System.out.println(dbName);
		System.out.println(rateOfIntrest);
	//	display2();
		getData2();
	}
	
	public static void getData2(){
		System.out.println("in static getData2");
	}
	
	public void display1(){
		System.out.println(dbName);
		System.out.println(rateOfIntrest);
		display2();
		getData2();
	}
	
	public void display2(){ 
		System.out.println("inside  display2");
	}
}
