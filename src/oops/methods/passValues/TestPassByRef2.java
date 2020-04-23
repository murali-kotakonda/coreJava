package oops.methods.passValues;

import oops.methodEx2.Person;

public class TestPassByRef2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.id= 2001;
		p1.name= "user1";
		p1.age =29;
		
		System.out.println("before call");
		show(p1);
		
		modify(p1);
		
		System.out.println("after call");
		show(p1);
	}
	
	public static void show(Person pObj){
		System.out.println(pObj.id);
		System.out.println(pObj.name);
		System.out.println(pObj.age);
	}
	
	private static void modify(Person p2){
		p2.id= 4000;
		p2.name= "user11";
		p2.age =45;
	}
}
