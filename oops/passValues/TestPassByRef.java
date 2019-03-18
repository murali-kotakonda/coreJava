package oops.passValues;


public class TestPassByRef {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.id= 2001;
		p1.name= "user1";
		p1.age =29;
		
		System.out.println("before call");
		p1.display();
		
		modify(p1);
		
		System.out.println("after call");
		p1.display();
	}
	
	private static void modify(Person pObj){
		pObj.id= 4000;
		pObj.name= "user11";
		pObj.age =45;
	}
}
