package vindhu.oops;
import java.util.*;
public class TestPerson {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			String fname=s.next();
			String lname=s.next();
			String gender=s.next();
			String houseno=s.next();
			String city=s.next();
			String country=s.next();
			long pincode=s.nextLong();
			Person p=new Person(fname,lname,gender,houseno,city,country,pincode);
			p.show();
	}
}
