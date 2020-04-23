package inherit.typecast;

public class TestRunTimePoly {
	public static void main(String[] args) {
		//1. create obj for sub class - Student and refer by Person 
		Person per = new Student();
		
		//2. set data for student
		per.setId("9999");
		per.setName("Krishna");
		per.setAge(16);
		
	
		//3. get data for student
		System.out.println(per.getAge());
		System.out.println(per.getId());
		System.out.println(per.getName());
		
		//caLL THE SUBCLASS METHODS for Student
		
		Student s = ((Student) per);
		s.setBranchId("cse");
		s.setSemNo("2");

		System.out.println(s.getBranchId());
		System.out.println(s.getSemNo());
		
		
		 //4.create obj for sub class - Employee and refer by Person 
		per = new Employee();
		
		//5. set data for Employee
		per.setId("567");
		per.setName("Radha");
		per.setAge(31);
		
		
		//6. get data for Employee
		System.out.println(per.getAge());
		System.out.println(per.getId());
		System.out.println(per.getName());
		 
		//caLL THE SUBCLASS METHODS for Employee
		Employee e = (Employee) per;
		e.setPayrollId("pay_1");
		e.setProjectId("pro_1234");
		
		System.out.println(e.getProjectId());
		System.out.println(e.getPayrollId());
		
	}

}
