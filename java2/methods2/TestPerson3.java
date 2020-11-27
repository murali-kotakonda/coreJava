package methods2;


// local variables  : varible created inside the method


public class TestPerson3 {

	// write the print logic one time and reuse for all three objs
	// create obj & set data logic write for one time and reuse for all three objs
	
	public static void main(String[] args) {
		//1. create obj
		Person p1 = getData(1000,"kumar",23);
		System.out.println("*********print p1********************");
		show(p1);
		
		Person p2 = getData(1001,"shyam",25);
		System.out.println("*********print p2********************");
		show(p2);
		
		Person p3= getData(1004,"ram",29);
		System.out.println("*********print p3********************");
		show(p3);
		
	}	

	public static void show(Person p) {// object as the input arg
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
		// p is the local variable
	}
	
	
	// method returning the object
	public static Person getData(int id, String name, int age) {
		// create  obj
		Person p= new Person();

		//2.set the data
		p.id=id;
		p.name=name;
		p.age=age;

		return p;
		
		// id , name , age , p are  the local variables....
	}
}
//24
//42
//60