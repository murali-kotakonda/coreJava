package inherit.multilevel;

public class Staff extends Employee {

	String contractID;
	String contractPeriod;

	public void displayStaff() {
		System.out.println(contractID);
		System.out.println(contractPeriod);
	}
	 
}
