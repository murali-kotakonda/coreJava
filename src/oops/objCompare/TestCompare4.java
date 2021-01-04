package oops.objCompare;

public class TestCompare4 {
	public static void main(String[] args) {
		Person p1 = new Person(20001,"user1" ,30 );
		Person p2 = new Person(20001,"user1",30 );

		if (p1.equals(p2)) {
			System.out.println("objs are equal");
		} else {
			System.out.println("objs not equal");
		}
	}
}
