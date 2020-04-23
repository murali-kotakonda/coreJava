package oops.overload1;

public class Calculator {

	public void add(int x , int y){
		System.out.println(x+y);
	}
	
	public void add(int x , int y , int z){
		System.out.println(x+y+z);
	}
	
	public void add(int x , float y){
		System.out.println(x+y);
	}
	
	public void add(float x , int y){
		System.out.println(x+y);
	}
	
	public void add(float x , float y){
		System.out.println(x+y);
	}
}
