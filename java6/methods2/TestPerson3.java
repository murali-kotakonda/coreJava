package methods2;

public class TestPerson3 {

	//simplify print logic
	//write print logic one time and reuse for p,p1,p2
	// simplify create obj + setting data 
	
	public static void main(String[] args) {
		//create obj
		Person p =  getData(12000,23,"user1");
		show(p);
		
		Person p1 = getData(13000,24,"user2");
		show(p1);
		
		Person p2 = getData(17000,25,"user3");
		show(p2);
		
		Person p4 = getData(2100,26,"user4");
		show(p4);
	}
	
	//show funtion that takes person obj as input
	public static void show(Person pObj) {
		System.out.println(pObj.id);
		System.out.println(pObj.age);
		System.out.println(pObj.name);
	}
	
	//funtion returning the obj
	public static Person getData(int id, int age, String name) {
		Person pObj = new Person();
		pObj.id = id;
		pObj.age= age;
		pObj.name =name;
		
		return pObj;
	}
}
