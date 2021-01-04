package oops.encap;

public class TestPerson {

	public static void main(String[] args) {
		// 1.create obj
		Person p = new Person();
		
		//set data
		//p.id = 2000;
		p.setId(2000);
		//p.name="kumar";
		p.setName("kumar");
		//p.age=34;
		p.setAge(34);
		//p.sal=11111;
		p.setSal(11111);
		
		//print
		//System.out.println(p.id);
		System.out.println(p.getId());
		
		//System.out.println(p.name);
		System.out.println(p.getName());
		
		//System.out.println(p.age);
		System.out.println(p.getAge());
		
		//System.out.println(p.sal);
		System.out.println(p.getSal());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}