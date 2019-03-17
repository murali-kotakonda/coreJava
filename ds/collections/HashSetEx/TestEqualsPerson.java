package ds.collections.HashSetEx;

public class TestEqualsPerson {
	public static void main(String[] args) {

		Person p1 = new Person(1, "user1", 29);
		Person p3 = new Person(1, "user1", 29);
		
		if(p1==p3){
			System.out.println("adress equal");
		}else{
			System.out.println("adress not  equal");
		}

		
		if(p1.equals(p3)){
			System.out.println("p1 and p3 are duplicates");
		}else{
			System.out.println("p1 and p3 are not duplicates");
		}

		
		
		
		Person p2 = new Person(2, "user2", 28);
		
		//use equals method inheritd from super class to check for objects equality
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		
	}
}
