package varargs;

public class TestVarArgs {
	public static void main(String[] args) {
		System.out.println("------------display-----");
		display();
		display("hi");
		display("hi","how");
		display("java programming",".net","c++"); 
	}

	public static void display(String... data){
		for(String v: data){
			System.out.println(v);
		}
	}
}



/*
public static void display(String... data){
	 
}

ex: 
display("hi","hello");
display("kumar")


public static void display2(int... data){
	 
}
ex:
display2(7)
display2(1,2,3,4,5,6,7)

public static void display3(float... data){
	 
}
ex: 
display3(12.67,24.242)
display3(24.45,353.3435,35353.33,1.0)

public static void display4(int x, String... data){
	 
}
ex:
display4(4, "hello","hi","ram");
display4(5, "kumar");
display4(20, "user1", "user6", "user2", "user4", "user4",);
*/
