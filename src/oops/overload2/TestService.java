package oops.overload2;

public class TestService {
public static void main(String[] args) {
	Service s = new Service();
	
	Person p = new Person(2000,"user1");
	s.save(p);
	
	Employee e =new Employee(123,"user3", 12341f);
	s.save(e);

}
}
