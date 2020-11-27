package instanceMethods;

public class TestPerson {

	// if method is called using object
	//then logic of method is applied on the calling object
	public static void main(String[] args) {

		Person p1 = new Person();
		p1.id= 1000;
		p1.name="user1";
		p1.age=34;

		System.out.println("********print p1***********");
		p1.show(); 
		//if show method is called using p1 , then logic inside show funtion is 
		//appied on the p1's data
		
		Person p2 = new Person();
		p2.id= 1001;
		p2.name="usre2";
		p2.age=39;
		
		
		System.out.println("********print p2***********");
		p2.show();
		//if show method is called using p1 , then logic inside show funtion is 
		//appied on the p1's data
	}
	
}
