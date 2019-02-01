package oops;

public class TestPersonWithIM{
	public static void main(String[] args) {
		Person p1 = prepareObj(2000, "albert", 45, "yutytyg");
		Person p2 = prepareObj(2001, "joshy", 32, "32439hgh");
		Person p3 = prepareObj(2002, "shyam", 25, "gftfdtd5");
		
		
		p1.show();
		p2.show();
		p3.show();
	}

	private static Person prepareObj(int id, String name, int age, String aadhr) {
		Person pObj = new Person();
		pObj.id = id;
		pObj.name = name;
		pObj.age = age;
		pObj.aadhar = aadhr;
		return pObj;
	}
}
