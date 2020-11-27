package oops;

public class TestPerson4 {

	public static void main(String[] args) {
		//create obj for p1
		Person p1 = new Person();//p1 internally memory fo id,name,age ,aadhar
		
		//set data for p1
		p1.id= 1000;
		p1.aadhar=1111;
		p1.age=18;
		p1.name="kumar";
		
		
		//assign p1 to p2
		Person p2 = p1; // HERE NEW OBJECT IS NOT CREATED , Same obj is pointed  by p1 & p2 ; p1 & p2 has same address
		
		System.out.println("**************** BEFORE CHANGE************************");
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
		
		
		//set data for p2 
		p2.id= 1001;
		p2.aadhar=2222;
		p2.age=28;
		p2.name="shyam";
		
		
		System.out.println("**************** AFTER CHANGE************************");
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
