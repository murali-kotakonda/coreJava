package oops.staticBlockEx;

public class TestService {
	public static void main(String[] args) {
		 System.out.println("*************Objs Creation*****************");
		 Service s1 = new Service("oracle");//static block and constructr are executed
		 Service s2 = new Service("sql");//only constructr is executed
		 Service s3 = new Service("hana");//only constructr is executed
		 
		 System.out.println("************print obj data*********************");
		 System.out.println(s1.dbName); // access instance variable for s1
		 System.out.println(s2.dbName); // access instance variable for s2
		 
		 System.out.println("*************Access static data********************");
		 System.out.println(Service.rateOfIntrest); // access static variable
		 Service.rateOfIntrest = 19.89;// change static variable
		 System.out.println(Service.rateOfIntrest);// access static variable
	}
}
