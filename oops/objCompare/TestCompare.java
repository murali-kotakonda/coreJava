package oops.objCompare;

public class TestCompare {
public static void main(String[] args) {
	Person p1 = new Person(20001,30, "user1");
	Person p2 = new Person(20001,30, "user1");
	
 	if(p1.equals(p2)){
		System.out.println("objs are equal");
	}else{
		System.out.println("objs not equal");
	}
	
}
}
