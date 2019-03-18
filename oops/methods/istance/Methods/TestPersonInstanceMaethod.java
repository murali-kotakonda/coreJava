package oops.methods.istance.Methods;


public class TestPersonInstanceMaethod {
	public static void main(String[] args) {
		//create obj
		Person p1 =  getPersonObj(2010, "user2", 25);		
		p1.display();
		
		Person p2 =  getPersonObj(2009, "user3", 29);		
		p2.display();
		
		Person p3 =  getPersonObj(2011, "user4", 35);
		p3.display();
	}

	public static Person getPersonObj( int id,	
			String name, int age){
		Person obj = new Person();

		obj.id= id;
		obj.name=name;
		obj.age=age;
		
		return obj;
	}
 }
