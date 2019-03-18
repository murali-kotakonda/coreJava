package inherit.scopes;

import oops.scopes.Info;

public class TestInfo {
	public static void main(String[] args) {
		Info i = new Info();
		i.id = 12000;
		//i.name ="adad"; private cannot be accessed
		//i.age=45; protected cannot be accssed outside pkg
		//i.count=1; default cannot be accessed outside pkg
		
	}
}
