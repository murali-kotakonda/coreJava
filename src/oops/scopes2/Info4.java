package oops.scopes2;

import oops.scopes1.Info;

public class Info4 extends Info {

	public void show(){
		//access everything within class
		System.out.println(id);
		//System.out.println(name);
		System.out.println(age);
		//System.out.println(count);
	}
	
}
