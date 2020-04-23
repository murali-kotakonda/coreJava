package vindhu.Polymorphism;

public class CustomerValidation {
	public  boolean validation(Customer c) {
		boolean result=true;
		if(!c.city.equals("hyderabad")&&!c.city.equals("banglore")&&!c.city.equals("chennai"))
		{
			System.out.println("invalid city");
			result=false;
		}
		else if(c.mobile.length()!=10) {
			System.out.println("invalid mobile number");
			result=false;
		}
		else {
			for(int i=0;i<c.email.length();i++) {
				if(c.email.charAt(i)=='@') {
					for(int j=i+1;j<c.email.length();j++)
					{
						if(c.email.charAt(j)!='.') {
							result=false;
						}
						else {
							result=true;
							break;
						}
					}
				}
			}
			if(result==false) {
				System.out.println("invalid email id");
			}
		}
		return result;
	}
}
