package oops.staticMethods;

public class TestDAO2 {

	 public static void main(String[] args) {
		//call instace method
		 Dao d = new Dao();
		 d.show();// call using the object
		 
		 
		 //call static method
		 Dao.print(); // call using class name
	}
	
	
}
