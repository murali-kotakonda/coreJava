package oops.methods.passValues;

import oops.methodEx2.Person;

public class TestPassByRef {
	public static void main(String[] args) {
		//create obj
		Person p1 = new Person();// new obj created for p1
		
		//set data
		p1.id= 2001;
		p1.name= "user1";
		p1.age =29;
		
		System.out.println("before call");
		System.out.println(p1.id + " "+p1.name + " "+p1.age );
		 
		
		//pass obj to the modify method
		modify(p1);  
		
		System.out.println("after call");
		System.out.println(p1.id + " "+p1.name + " "+p1.age );
		 
		
	}
	

	 
	
	public static void modify(Person p2){ 
		p2.id= 4000;
		p2.name= "user11";
		p2.age =45;
	}
}



	// if method1() calls method2() by passing obj , if the method2() is modifying obj ,
	//then it will have impact on method1()
	
	
	// p2 and p1 are same objects ;
    //p2 is local variable in modify method