package serialize;

import java.io.Serializable;

public class Address implements Serializable {

	@Override
	public String toString() {
		return "Address [state=" + state + ", country=" + country + "]";
	}

	public String state;
	public String country;

	public Address(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}

	public Address() {

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

}
