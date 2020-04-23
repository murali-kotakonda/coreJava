package oops.staticBlockEx;

public class Service {
	//instance varible
	String dbName;
	
	//static variable
	static double rateOfIntrest;
	
	 static{
		 System.out.println("in static block");
		 rateOfIntrest = 12.5d;
	 }

	public Service(String dbName) {
		System.out.println("in constructor");
		this.dbName = dbName;
	}
}
