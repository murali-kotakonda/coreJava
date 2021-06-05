package setExs;

public class TestCompareObjs {
public static void main(String[] args) {

	//create p1  
	Person p1 = new Person(123, "user5", 45);

	//create p2
	Person p2 = new Person(123, "user5", 45);
	
	
	if(p1 == p2) {
		System.out.println("Objs are same");
	}else {
		System.out.println("Objs are not same");
	}
	
}
}

// == compares the object address
