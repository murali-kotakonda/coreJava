package oops.methodEx2;

/**
  Req:
  create 3 person objs
  set data
  display data
  simplify the logic for printing the obj data
  write print logic one time and reuse for all objs.
  
  solution:
  write a method that takes obj as argument and print obj data
 */
public class TestPerson2 {
	public static void main(String[] args) {
		//create obj
		Person p1 = new Person();
		p1.id= 1000;
		p1.name = "user1";
		p1.age= 30;
		
		Person p2 = new Person();
		p2.id= 1001;
		p2.name = "user2";
		p2.age= 31;
		
		Person p3 = new Person();
		p3.id= 1002;
		p3.name = "user3";
		p3.age= 32;
		
		
		show(p1);// pObj = p1
		show(p2);// pObj = p2
		show(p3);// pObj = p3
	}

	//function that takes obj as input arg
	private static void show(Person Pobj) {
		System.out.println(Pobj.id);
		System.out.println(Pobj.name);
		System.out.println(Pobj.age);
	}

}
