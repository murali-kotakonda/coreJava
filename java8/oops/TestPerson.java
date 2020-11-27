package oops;

public class TestPerson {
public static void main(String[] args) {
	
	//set data for two persons and print
	
	Person p1 = new Person();//p1 internally memory fo id,name,age ,aadhar
	
	//set data
	p1.id= 1000;
	p1.aadhar=1111;
	p1.age=18;
	p1.name="kumar";
	
	
	
	Person p2 = new Person();//p2 internally memoey fo id,name,age ,aadhar
	
	//set data
	p2.id= 1001;
	p2.aadhar=2222;
	p2.age=28;
	p2.name="shyam";
	
	
	//print data
	System.out.println(p1.id);
	System.out.println(p1.name);
	System.out.println(p1.age);
	System.out.println(p1.aadhar);
	
	System.out.println("********************************************");
	System.out.println(p2.id);
	System.out.println(p2.name);
	System.out.println(p2.age);
	System.out.println(p2.aadhar);
	
	
}
}
