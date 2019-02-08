package staticBlockEx;

public class ServiceSingleton { 
	
	private static ServiceSingleton obj;
	
	private ServiceSingleton(){
		
	}
	
	public static ServiceSingleton getObj(){
		if(obj==null)
			obj = new ServiceSingleton();
		
		return obj;
	}
	
}
