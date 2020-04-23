package oops.encap;

public class TestStudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("user1");
		s.setId("12345");
		s.setBranch("cse");
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getBranch());
		
	}
}
