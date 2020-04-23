package com.mnp.compositionEncap;

public class TestEmployeeWithAddressConstructor {
	public static void main(String[] args) {
		Employee emp1 = getEmp1();
		Employee emp2 = getEmp2();
		emp1.print();
		emp2.print();
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
		//emp1.setAddress(localAdd1);
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
		//emp1.setAddress(localAdd1);
		return emp1;
	}
	 
}
