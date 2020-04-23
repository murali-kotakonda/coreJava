//person has fname,lname,gender address(city,state,country)
package vindhu.oops;

public class Person {
	String fname;
	String lname;
	String gender;
	String houseno;
	String city;
	String country;
	long pincode;
	public Person() {
		
	}
	
	public Person(String fname, String lname, String gender, String houseno, String city, String country,
			long pincode) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.houseno = houseno;
		this.city = city;
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
		System.out.println(country);
		System.out.println(pincode);
		
	}
	

}
