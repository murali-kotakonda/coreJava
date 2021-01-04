package oops.objCompare;

public class TestCompare2 {
public static void main(String[] args) {
	Person p1 = new Person(2000,"user1",30 );
	
	Person p3 = p1; //new object is not created , both p1 & p2 has same address.

	if(p3 == p1){
		System.out.println("objs are equal");
	}else{
		System.out.println("objs not equal");
	}
	
}
}
