package oops.methodEx2;

public class TestPerson3 {
	public static void main(String[] args) {
		//create obj
		Person p1 =  getPersonObj(2010, "user2", 25);		
		show(p1);
		
		Person p2 =  getPersonObj(2009, "user3", 29);		
		show(p2);
		
		Person p3 =  getPersonObj(2011, "user4", 35);		
		show(p3);
	}

	public static Person getPersonObj( int id,	String name, int age){
		Person obj = new Person();
		obj.id= id;
		obj.name=name;
		obj.age=age;
		return obj;
	}
	
	public static void show(Person pObj){
		System.out.println(pObj.id);
		System.out.println(pObj.name);
		System.out.println(pObj.age);
	}
}
