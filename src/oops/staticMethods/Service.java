package oops.staticMethods;


public class Service {
	//instance variable
	String dbName= "oracle";
	
	//static variable
	static double rateOfIntrest = 12.5d;
	
	public void m1(){
		System.out.println(dbName);
		System.out.println(rateOfIntrest);
		m2();
		m4();
	}
	
	public void m2(){ 
		System.out.println("inside  display2");
	}
	
	public static void m3(){ 
		//System.out.println(dbName);// cannot acces instance variable
		System.out.println(rateOfIntrest);
		//m2();//cannot access instance method
		m4();
	}
	
	public static void m4(){
		System.out.println("in static getData2");
	}
}