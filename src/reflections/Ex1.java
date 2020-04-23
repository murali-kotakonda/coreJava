package reflections;

public class Ex1 {
	public static void main(String args[]) throws ClassNotFoundException {
		Class c = Person.class; 
		System.out.println(c.getName());
	
		c = Student.class;
		System.out.println(c.getName());
		
		c = Class.forName("reflections.Person");
		System.out.println(c.getName());
		
		c = Class.forName("reflections.Student");
		System.out.println(c.getName());
	}
}
