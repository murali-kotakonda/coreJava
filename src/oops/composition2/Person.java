package composition2;

public class Person {
   int id;
   String name;
   int age;
   
   Address addr;
   
   
   public void showPersonInfo() {
	   System.out.println(id);
	   System.out.println(name);
	   System.out.println(age);
}
   
}
