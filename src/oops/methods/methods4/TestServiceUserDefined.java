package oops.methods.methods4;

public class TestServiceUserDefined {
	public static void main(String[] args) {
		ServiceUserDefined service = new ServiceUserDefined();
		
		//1.create obj
		Person person1 = service.preparePerson
				("user1","bncpk76rf3", 34);
		
		//2.display obj
		
		service.display(person1);
		
		//3.create obj
		Person person2 = service.preparePerson
				("user2","mypancard335", 35);
		
		//4.disply oj
		service.display(person2);
		
		//5.copy person
		Person person3 = service.copyPerson(person2);
		
		//6.dsipaly person3
		service.display(person3);
	}
}
