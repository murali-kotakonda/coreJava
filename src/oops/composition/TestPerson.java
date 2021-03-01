package has_a;

/**
Req: capture the personinfo with address and print


steps:
1.Create Address class
2.Create Person class with addObj as instance variable

3.Create person obj with data
4.Create address obj with data
5.keep adress obj inside person obj
6.Print person info and address info

 */
public class TestPerson {
public static void main(String[] args) {
	
	//Create person obj with data
	Person  p = new Person("user1",4000);
	
	//Create address obj with data
	Address a1 = new Address("tulasi theatre", "560037", "bang", "ka", "in");
	
	//keep adress obj inside person obj
	p.currAddress = a1;
	
	System.out.println("**************Approach1****************");
	//print
	System.out.println(p.id);
	System.out.println(p.name);
	
	
	System.out.println(p.currAddress.hno);
	System.out.println(p.currAddress.city);
	System.out.println(p.currAddress.state);
	System.out.println(p.currAddress.country);
	System.out.println(p.currAddress.pinCode);
	
	System.out.println("**************Approach2****************");
	p.printPersonalInfo();
	p.currAddress.showAddress();
	
	
}
}
