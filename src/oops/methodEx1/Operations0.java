package oops.methodEx1;

public class Operations0 {
	public static void main(String[] args) {
		System.out.println("hello");
		show();
	}
	//funtion with no input and no return type
	public static void show(){
		System.out.println("hi from show method");
	}
	
	//funtion that retuns int
	public int getInt() {
		return 10;	
	}
	
	//funtionn with str as return type
	public String getMsg(){
		return "Registraion success";
	}
	
	//funtion with input
	public void sum(int x , int y){
		int sum = x+y;
		System.out.println("sum= "+sum);
	}
	
	//funtion with input
	public void process(String s){
			String m = "Mr/Mrs" +s;
			System.out.println("res = "+m);
	}
		
	
	public int getSum(int x , int y){
		int sum = x+y;
		return sum;
	}
	
	public void hi() {
		System.out.println("in hi ");
		bye();
		System.out.println("end hi");
	}
	
	public void bye() {
		System.out.println("in bye");
	}
	
}