package oops.objCompare;

public class TestConst {
public static void main(String[] args) {
	Person p1 = new Person(20001,"user1" ,30 );
	Person p2 = new Person(20001,"user1",30 );
	
	if(p1== p2){
		System.out.println("objs are equal");
	}else{
		System.out.println("objs not equal");
	}
	// p1==p2 compares the obj's address[memory location]
	//p1==p2 , will not compare the content of objs
}
}
