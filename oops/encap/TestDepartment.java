package oops.encap;

public class TestDepartment {
	public static void main(String[] args) {
		Department d1=new Department("computers", "1234");
		Department d2=new Department("electrical", "234");
		Department d3=new Department("mechanical", "986");
		Employee e1=new Employee("abc","xyz","male","4567");
		Employee e2=new Employee("abcd","wxyz","male","34567");
		Employee e3=new Employee("abc","xyz","male","4567");
		Employee e4=new Employee("abcd","wxyz","male","34567");
		Employee e5=new Employee("abc","xyz","male","4567");
		Employee e6=new Employee("abcd","wxyz","male","34567");
		d1.display();
		e1.show();
		e2.show();
		d2.display();
		e3.show();
		e4.show();
		d3.display();
		e5.show();
		e6.show();
		
	}
	
}
