package oops.scopes2;

import oops.scopes1.Info;

public class Info3 {

	public void show(){
		//access everything within class
		Info i = new Info();
		System.out.println(i.id);
		//System.out.println(i.name);
		System.out.println(i.age);
		System.out.println(i.count);
	}
	
}
