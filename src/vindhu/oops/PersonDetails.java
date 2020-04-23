package vindhu.oops;

public class PersonDetails {
		
	String fname;
	String lname;
	String gender;
	String houseno;
	String city;
	String state;
	String country;
	long pincode;
	public PersonDetails(String fname, String lname, String gender) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}
	public PersonDetails(String fname, String lname, String gender, String houseno, String city, String state, String country,
			long pincode) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.houseno = houseno;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public PersonDetails(String houseno, String city, String state, String country, long pincode) {
		this.houseno = houseno;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public void show()
	{
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(houseno);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(pincode);	
	}
	public void showDetails()
	{
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
	}
	public void showAddress()
	{
		System.out.println(houseno);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(pincode);	
	}
}
