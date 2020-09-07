package oops.methodEx2;

import java.util.Scanner;

/**
    Req:
  create 3 person objs
  set data
  display data
  write print logic one time and reuse for all objs
  simplify the logic for create obj + set data
  
  solution:
  write a method that returns obj ; method should take care of  create obj + set data
  take input from console
 */
public class TestPerson4 {
	public static void main(String[] args) {
		//create obj
		Person p1 =  getPersonObj();		
		show(p1);
		
		Person p2 =  getPersonObj();		
		show(p2);
		
		Person p3 =  getPersonObj();		
		show(p3);
	}

	public static Person getPersonObj(){
		Scanner sc = new Scanner(System.in);
		
		Person obj = new Person();
		
		System.out.println("Enter id");
		obj.id= sc.nextInt();
		
		System.out.println("Enter name");
		obj.name=sc.next();
		
		System.out.println("Enter age");
		obj.age=sc.nextInt();

		return obj;
	}
	
	public static void show(Person pObj){
		System.out.println(pObj.id);
		System.out.println(pObj.name);
		System.out.println(pObj.age);
	}
}
