package collections;

public class TestPersons1 {
public static void main(String[] args) {
	
	//create 4 person objs
	Person p1 = new Person(2000,"user1");
	Person p2 = new Person(2001,"user2");
	Person p3 = new Person(2002,"user3");
	Person p4 = new Person(2003,"user4");


	//add 4 person objs inside array
	/*	Person [] persons = new Person[4];
		persons[0] = p1;
		persons[1] = p2;
		persons[2] = p3;
		persons[3] = p4;
    */
	
	//add the persons obj inside the array
	Person persons[] = {p1,p2,p3,p4};
	
	System.out.println("****** Print Persons***********");
	
	for(Person p : persons) {
		System.out.println("************************************************");
		p.display();
		
	}
	
}
}
