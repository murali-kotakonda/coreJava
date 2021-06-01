package inherit.single;

public class TetInherit {
	public static void main(String[] args) {
			// create obj for person , set data and display
		Person p = new Person();
		p.name = "testUser2";
		p.age = 50;
		p.id = 65556;

		System.out.println("*************displaying person info**************");
		p.displayPerson(); // shows id,name, age for Person

	
			// create obj for Employee , set data and display
		Employee emp = new Employee();
		// set data for inherited props
		emp.name = "testUser1";
		emp.age = 45;
		emp.id = 12345;
		// set data for child specific props
		emp.pan = "bnadh671a6";
		emp.pfNo = "testPfNo";

		System.out.println("*************displaying Employee info**************");
		emp.displayPerson();// shows id,name, age for Employee
		emp.displayEmp();// shows pan,pfNo for Employee

	}
	// displayPerson() method can be called by Person obj and Employee obj also.
}
