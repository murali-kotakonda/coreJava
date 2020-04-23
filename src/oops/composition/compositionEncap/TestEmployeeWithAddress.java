package com.mnp.compositionEncap;

public class TestEmployeeWithAddress {
	public static void main(String[] args) {
		Employee emp1 = getEmp1();
		Employee emp2 = getEmp2();
		emp1.print();
		/*Address address = emp1.getAddress();
		System.out.println(address.getCity());
		System.out.println(address.getCountry());
		System.out.println(address.getHno());
		System.out.println(address.getPin());
		System.out.println(address.getState());
		System.out.println(address.getStreetName());
		*/
		emp2.print();
		emp2.getAddress().print();
	}

	private static Employee getEmp2() {
		Employee emp1 = new Employee();
		//set data fr emp obj
		emp1.setId(1235);
		emp1.setAge(28);
		emp1.setName("user2");
		
		//create addres obj
		Address localAdd1= new Address();
		//set data for addres
		localAdd1.setCity("bang");
		localAdd1.setCountry("IN");
		localAdd1.setHno("56");
		localAdd1.setPin("560037");
		localAdd1.setState("TN");
		localAdd1.setStreetName("HYD");
		
		//set relatn between emp and address
		emp1.setAddress(localAdd1);
		return emp1;
	}
	private static Employee getEmp1() {
		Employee emp1 = new Employee();
		//set data fr emp obj
		emp1.setId(1236);
		emp1.setAge(29);
		emp1.setName("user1");
		
		//create addres obj
		Address localAdd1= new Address();
		//set data for addres
		localAdd1.setCity("chennai");
		localAdd1.setCountry("IN");
		localAdd1.setHno("56");
		localAdd1.setPin("560037");
		localAdd1.setState("TN");
		localAdd1.setStreetName("selam");
		
		//set relatn between emp and address
		emp1.setAddress(localAdd1);
		return emp1;
	}
	 
}
