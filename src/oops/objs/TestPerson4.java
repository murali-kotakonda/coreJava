package oops.objs;

/**
Req: 
create one person obj
set data  
and display data

Create second obj by using the assignment operator.

*/
public class TestPerson4 {

	public static void main(String[] args) {
		//create the obj for p1 
		Person p1 = new Person(); // new object is created.

		//set the data FOR P1
		p1.id=1200;
		p1.age=23;
		p1.name ="kumar";
		
		// assign p1 to p2
		Person p2 = p1;  // no new object is created. Both p1 and p2 are pointing to same object
		
		// p1 and p2 has the same data
		System.out.println("************** ASSIGN P1 TO P2 ***************************");
		//show data
		System.out.println("***************show p1 data******************");
		System.out.println(p1.id);
		System.out.println(p1.age);
		System.out.println(p1.name);

		System.out.println("***************show p2 data******************");
		System.out.println(p2.id);
		System.out.println(p2.age);
		System.out.println(p2.name);
		
		
		//change p2 , it also changes p1
		p2.id=1300;
		p2.age=24;
		p2.name ="shyam";
		
		System.out.println("************** change p2 and print P1 TO P2 ***************************");
		//show data
		System.out.println("***************show p1 data******************");
		System.out.println(p1.id);
		System.out.println(p1.age);
		System.out.println(p1.name);

		System.out.println("***************show p2 data******************");
		System.out.println(p2.id);
		System.out.println(p2.age);
		System.out.println(p2.name);
		
	}
}


//as p1 and p2 are pointng to same obj , 
//if we change p1 , it will change p2 also
//if we change p2 , it will change p1 also


