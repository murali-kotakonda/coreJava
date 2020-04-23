package reflections;

public class Ex2 {
	public static void main(String args[]) throws ClassNotFoundException {
		Person p = new Person();
		Student s = new Student();
		
		
		 Class c=p.getClass();    
		 System.out.println(c.getName());  
		 
		 Class c1=s.getClass();    
		 System.out.println(c1.getName()); 
		 System.out.println(c1.getSuperclass().getName()); 
		 
	}
}
