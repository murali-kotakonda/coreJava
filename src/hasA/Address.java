package hasA;

public class Address {

	private String streetNo;
	private String city;
	private String state;
	private String country;
	private String pin;

	public Address(String streetNo, String city, String state, String country, String pin) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void display() {
		System.out.println(streetNo);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(pin);
	}

}
