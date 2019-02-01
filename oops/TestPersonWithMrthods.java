package oops;

public class TestPersonWithMrthods {
	public static void main(String[] args) {
		Person p1 = prepareObj(2000, "albert", 45, "yutytyg");
		Person p2 = prepareObj(2001, "joshy", 32, "32439hgh");
		Person p3 = prepareObj(2002, "shyam", 25, "gftfdtd5");
		
		display(p1);
		display(p2);
		display(p3);
	}

	private static Person prepareObj(int id, String name, int age, String aadhr) {
		Person pObj = new Person();
		pObj.id = id;
		pObj.name = name;
		pObj.age = age;
		pObj.aadhar = aadhr;
		return pObj;
	}

	public static void display(Person inputObj) {
		System.out.println(inputObj.id);
		System.out.println(inputObj.name);
		System.out.println(inputObj.age);
		System.out.println(inputObj.aadhar);
	}
}
