package setExs;

public class TestCompareObjs2 {
public static void main(String[] args) {

	//create p1  
	Person p1 = new Person(123, "user5", 45);

	//create p2
	Person p2 = new Person(123, "user5", 45);
	
	
	if(p1.equals(p2)) {
		System.out.println("Objs are same");
	}else {
		System.out.println("Objs are not same");
	}
}
}

// for every java class the parent class is "Object"
//equals() , hashcode() , wait() , toString() , notify() are inherited methods from Object class.

// default behaviour of equals() method is to compare the obj address


//to compare two java objecte
//1. override the equals() and hashcode() methods
//2.use equals() method for comparing