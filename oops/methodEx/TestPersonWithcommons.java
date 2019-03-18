package oops.methodEx;

public class TestPersonWithcommons {
	public static void main(String[] args) {
		Person p1 = getPersonObj(1000, "user1", 30);
		Person p2 = getPersonObj(1001, "user2", 31);
		Person p3 = getPersonObj(1002, "user3", 32);
		Person p4 = getPersonObj(1003, "user4", 33);
		
		show(p1);
		show(p2);
		show(p3);
		show(p4);
	}

	private static Person getPersonObj(int id, 
							String name, int age) {
		Person pObj = new Person();
		pObj.id = id;
		pObj.name = name;
		pObj.age = age;
		return pObj;
	}

	private static void show(Person Pobj) {
		System.out.println(Pobj.id);
		System.out.println(Pobj.name);
		System.out.println(Pobj.age);
	}

}
