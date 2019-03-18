package inherit.scopes;

import oops.scopes.Info;

public class InfoChild extends Info {
	
	public void show(){
		System.out.println(id);
		//System.out.println(name); private
		System.out.println(age);
		//System.out.println(count); default 
	}
}
