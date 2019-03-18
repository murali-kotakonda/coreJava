package oops.methodEx;

public class TestPerson {
	public static void main(String[] args) {
		//create obj
		Person p1 =  getPersonObj(2010, "user2", 25);		
		showPersonInfo(p1);
		
		Person p2 =  getPersonObj(2009, "user3", 29);		
		showPersonInfo(p2);
		
		Person p3 =  getPersonObj(2011, "user4", 35);		
		showPersonInfo(p3);
	}

	public static Person getPersonObj( int id,	String name, int age){
		Person obj = new Person();

		obj.id= id;
		obj.name=name;
		obj.age=age;
		
		return obj;
	}
	
	public static void showPersonInfo(Person pObj){
		System.out.println(pObj.id);
		System.out.println(pObj.name);
		System.out.println(pObj.age);
	}
}
