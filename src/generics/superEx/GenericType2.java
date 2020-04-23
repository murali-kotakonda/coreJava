package generics.superEx;

import java.util.List;

public class GenericType2 {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.id =1234;
		
		Employee emp = new Employee();
		emp.id =1235;
		
		Student st = new Student();
		st.id =1236;
		
		User u = new User();
		u.id = 1235;
		
		
		show(p);
		show(emp);
		show(st);
		//show(u);
		//show("hello");
	}
	
	static <T extends Person> void show(T t) {
		System.out.println(t.id);
		
	}
	
	 
	static  void show4(List<?> list) {
		
	}
	
	static  void show3(List<? extends Person> list) {
		
	}
	
	static  void show2(List<? super Student> list) {
		
	}
}
