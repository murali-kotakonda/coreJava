package inherit.runTimeValidate;

import java.util.Scanner;

public class EmployeeValidation extends CustomerValidation {
	Scanner sc=new Scanner(System.in);
	@Override
	public  void input(Customer e1) {
		super.input(e1);
		Employee e = (Employee) e1;
		System.out.println("enter pan no:");
		e.pan=sc.next();
		System.out.println("enter pfno:");
		e.pfno=sc.next();
	}
	public  boolean validation(Employee e) {
		boolean result=super.validation(e);;
		if(result) {
			if(e.pan.length()!=10) {
				System.out.println("invalid pan no");
				result=false;
			}
			else if(e.pfno.length()!=10) {
					System.out.println("invalid pfno");
					result=false;
				}
			}
		return result;
	}
	public void save(Employee e) {
		super.save(e);
		System.out.println(e.pan);
		System.out.println(e.pfno);
	}
}
