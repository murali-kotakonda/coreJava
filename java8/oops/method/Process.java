package oops.method;

public class Process {
	
	// method returns value
	public String getData() {
		return "helloooooo";
	}
	
	//method thats take string as input and returns str value
	public String getData1(String x) {
		return "MR/MRs "  +  x;
	}
	
	
	public int sum(int x, int y) {
		int r = x+y;
		return r;
	}
	
	
	public int big(int x, int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	
	public int small(int x, int y) {
		if(x<y) {
			return x;
		}else {
			return y;
		}
	}
	
}
