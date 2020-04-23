package oops.objCompare;

public class TestConst2 {
public static void main(String[] args) {
	Person p1 = new Person(2000,30, "user1");
	
	Person p3 = p1;

	if(p3 == p1){
		System.out.println("objs are equal");
	}else{
		System.out.println("objs not equal");
	}
	
}
}
