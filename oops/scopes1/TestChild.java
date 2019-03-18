package oops.scopes1;

import oops.scopes.Info;

public class TestChild extends Info{

	public void show(){
		//access everything within class
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(count);
	}
}
