package vindhu.Polymorphism;

public class CustomerValidation1 {
	public  boolean validation(Customer1 c) {
		boolean result=true;
		if(!c.getCity().equals("hyderabad")&&!c.getCity().equals("banglore")&&!c.getCity().equals("chennai"))
		{
			System.out.println("invalid city");
			result=false;
		}
		else if(c.getMobile().length()!=10) {
			System.out.println("invalid mobile number");
			result=false;
		}
		else {
			for(int i=0;i<c.getEmail().length();i++) {
				if(c.getEmail().charAt(i)=='@') {
					for(int j=i+1;j<c.getEmail().length();j++)
					{
						if(c.getEmail().charAt(j)!='.') {
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
