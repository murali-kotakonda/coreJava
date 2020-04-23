package oops.methodEx1;

public class Operations1 {
	
	//funtion with no input and no return type
	public void show(){
		System.out.println("hi from show method");
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
		
	//funtion that retuns int
	public int getInt() {
		int x= 90;
		return x;	
	}
	
	public float getData() {
		float m= 1313.133f;
		return m;	
	}
	
	//funtionn with str as return type
	public String getMsg(){
		return "Registraion success";
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