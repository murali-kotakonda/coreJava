package oops.staticVari;

public class TestStudent {
	
	public static void main(String[] args) {
		System.out.println("******Access Static*************");
		// access static variables using class name
		Student.collegeName="xyz engg college";
		
		System.out.println(Student.collegeName);
		
		System.out.println("******Access instance*************");
		//access instance varibles
		//create the obj
		Student s = new Student();
		s.id =123;
		s.name ="kumar";
		s.semNo=3;
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.semNo);
	}
	
}