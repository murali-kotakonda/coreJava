package oops.staticVari;

public class TestStudent {
	
	public static void main(String[] args) {
		
		// access static variables.
		Student.colleageName = "REVA enggg colleg";
		
		//static variable is accessed using the class name
		Student s = new Student();
		s.id=1200;
		
		
		//print
		System.out.println(Student.colleageName);
		System.out.println(s.id);
		
		
	}
}
