package customeexception;

import java.util.Scanner;

public class TestRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome!! Please enter the peron info");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name");
		String name = sc.next();

		System.out.println("Enter age");
		int age = sc.nextInt();

		System.out.println("Enter city");
		String city = sc.next();

		System.out.println("Enter userType");
		String userType = sc.next();

		Person person = new Person(name, age, city, userType);

		try {
			validate(person);
			System.out.println("Registration success");
		} catch (BusinessException e) {
			String errCode = e.getErrCode();
			System.out.println(e.getMessage());
			System.out.println(errCode);
		}

	}

	private static void validate(Person person) 
			throws BusinessException{
		validateAndRegister(person);
		System.out.println("peson data processed"+person);
	}
	
	private static void validateAndRegister(Person person)
			throws BusinessException {

		if (person.getAge() < 18 || person.getAge() > 60) {
			BusinessException ex = new BusinessException("ERRO1","age is invalid");
			throw ex;
		}

		if (!(person.getCity().equals("hyd") || 
				person.getCity().equals("bangalore") || person
				.getCity().equals("chennai"))) {
			throw new BusinessException("ERRO2","unsupported city");
		}

		if (!(person.getUserType().equals("agent")
				|| person.getUserType()
				.equals("admin"))) {
			throw new BusinessException("ERRO3","invalid agent");
		}

		register(person);

	}

	private static void register(Person person) {
		// code to save the person info in db
	}

}
