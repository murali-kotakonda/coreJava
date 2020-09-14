package inherit.single.encap;

public class TetInherit3 {
	public static void main(String[] args) {
		// create obj for person
		Person p = new Person("testUser2",50,65556);
        // constr is to set data during obj creation it is 1 time usable.
		
		// how to set the data after obj creation?
		// setter methods can be using any no of times for setting the data
		p.setName("testruser4");
		p.setAge(34);
		p.setId(12333);
		
		System.out.println("displaying person info");
		p.displayPerson();
	}
}

//constr is one time set data during obj cretion
//setters is anytime to set data after the obj creation
