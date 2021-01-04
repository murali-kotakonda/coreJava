package exception.custom;

import java.util.Scanner;

/**
 Req:
take age as input
validate id, age , 
age< 18 is invalid and age> 18 is valid.
id< 0 is invalid and ID >0 is valid.
if valid ID,age then save to db

if validation fails only print -> invalid age

in validate() method throw the exception
in main() -> handle the exception

 */
public class Validation2 {
	public static void main(String[] args) {
		try {
			input();
		}
		catch(BusinessException ex) {
			System.out.println(ex.getErrCode());
		}
	}

	public static void input() throws BusinessException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age: ");
		int age = sc.nextInt();
		
		System.out.println("enter id: ");
		int id = sc.nextInt();
		
		process(id,age);
		System.out.println("prog success");	

	}

	public static void process(int id,int age) throws BusinessException {
		System.out.println("inside process - enter");
		 validate(id,age);
		System.out.println("inside process - exit");
	}

	public static void validate(int id,int age) throws BusinessException {
		System.out.println("inside validate - enter");

		if (age < 18) {
			throw new BusinessException("Age is invalid");
		}
		
		if (id < 0) {
			throw new BusinessException("ID is invalid");
		}
		
		save(id, age);
		System.out.println("inside validate - exit");
	}

	public static void save(int id,int age) {
		System.out.println("inside save - enter");
		System.out.println("id ,age saved");
		System.out.println("inside save - exit");

	}

}
