package oops.methodEx1;

public class TestOperations2 {
public static void main(String[] args) {
	Operations2 op = new Operations2();
	int w= 8;
	int x= 30;
	int y = 20;
	int z= 23;
	System.out.println(op.big(x,y));
	System.out.println(op.big(x, op.big(y,z)));
	System.out.println(op.big(w,op.big(x, op.big(y,z))));
}
}
