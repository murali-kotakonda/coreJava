package oops.scopes;

public class TestInfo {
	
	public void show(){
		//access everything within class
		Info i = new Info();
		System.out.println(i.id);
		//System.out.println(i.name);
		System.out.println(i.age);
		System.out.println(i.count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Info i = new Info();
		i.id = 12000;
		//i.name ="adad"; private cannot be accessed outside class
		i.age=45;
		i.count=1;
	}
}
