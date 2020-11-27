package methods2;

public class TestPerson2 {
	//simplify print logic
	//write print logic one time and reuse for p,p1,p2
	public static void main(String[] args) {
		//create obj
		Person p = new Person();
		// p is obj and p has memory for id,name,age
		
		//set data
		p.id = 12000;
		p.age= 23;
		p.name ="user1";
		
		//print data
		show(p);
		
		Person p1 = new Person();
		// p1 is obj and p1 has memory for id,name,age
		
		//set data
		p1.id = 13000;
		p1.age= 24;
		p1.name ="user2";
		
		//print data
		show(p1);
		
		
		Person p2 = new Person();
		// p1 is obj and p1 has memory for id,name,age
		
		//set data
		p2.id = 17000;
		p2.age= 25;
		p2.name ="user3";
		
		//print data
		show(p2);
	}
	
	//show funtion that takes person obj as input
	public static void show(Person pObj) {
		System.out.println(pObj.id);
		System.out.println(pObj.age);
		System.out.println(pObj.name);
	}
}
