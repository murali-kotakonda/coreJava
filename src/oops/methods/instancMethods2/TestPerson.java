package instancMethods2;
/**
Req:
	create 3 person objs
	set data
	display data
 */
public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person(1000,"user1",30);

		Person p2 = new Person(1001,"user2", 31);

		Person p3 = new Person(1002,"user3",32);

		System.out.println("********Print p1************");
		p1.print();// prints the id,name, age for p1 obj

		System.out.println("********Print p2************");
		p2.print();// prints the id,name, age for p2 obj

		System.out.println("********Print p3************");
		p3.print(); // prints the id,name, age for p3 obj
	}
}

//if the method is called using the object then logic inside the method is applied on the calling object.
/*

notes:
-----------
p1.print();
---> when print() fucntin is called using p1 then logic inside the print() function is 
applied on p1's data.

p2.print();
---> when print() fucntin is called using p2 then logic inside the print() function is 
applied on p2's data.

p3.print();
---> when print() fucntin is called using p3 then logic inside the print() function is 
applied on p3's data.

 * */

