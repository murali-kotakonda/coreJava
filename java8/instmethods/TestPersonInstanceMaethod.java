package instmethods;

public class TestPersonInstanceMaethod {
	public static void main(String[] args) {
		// create obj
		Person p1 = new Person();
		//set the data
		p1.id=2010;
		p1.name="user2";
		p1.age=25;
		
		//cal the display function
		p1.display();
		
		Person p2 = new Person();
		//set the data
		p2.id=2011;
		p2.name="user2";
		p2.age=26;
		
		//cal the display function
		p2.display();

		
		Person p3 = new Person();
		//set the data
		p3.id=2013;
		p3.name="user5";
		p3.age=29;
		
		//cal the display function
		p3.display();

	}
	
}
