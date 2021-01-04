package oops.methods.WithInstanceMethods;

public class TestPersonMethodAndConstr {
	public static void main(String[] args) {
		// create obj
		Person p1 = new Person(2010, "user2" , 25);
		System.out.println("**************printing p1****************");
		// cal the display function
		p1.display();
		//if the method is called using the object then logic inside the method is applied on the calling object.

		
		// create obj
		Person p2 = new Person(3000, "user3" , 35);
		System.out.println("**************printing p2****************");
		// cal the display function
		p2.display();// prints the id,name, age for p2 obj

		
		
		// create obj
		Person p3 = new Person(2012, "user5" , 20);
		System.out.println("**************printing p3****************");
		// cal the display function
		p3.display();// prints the id,name, age for p3 obj
		
	}
}


/*

notes:
-----------
p1.display();
---> when display() fucntin is called using p1 then logic inside the display() function is 
applied on p1's data.

p2.display();
---> when display() fucntin is called using p2 then logic inside the display() function is 
applied on p2's data.

p3.display();
---> when display() fucntin is called using p3 then logic inside the display() function is 
applied on p3's data.


 * */
