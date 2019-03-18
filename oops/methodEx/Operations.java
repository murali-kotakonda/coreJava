package oops.methodEx;

public class Operations {
	
	public void show(){
		System.out.println("hi from show method");
	}
	
	public void sum(int x , int y){
		int sum = x+y;
		System.out.println("sum= "+sum);
	}
	
	public int getSum(int x , int y){
		int sum = x+y;
		return sum;
	}
	
	public String getMsg(){
		return "Registraion success";
	}
	
}