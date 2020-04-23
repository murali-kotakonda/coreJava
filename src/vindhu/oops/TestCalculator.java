package vindhu.oops;
import java.util.Scanner;
public class TestCalculator {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			Calculator op=new Calculator();
			op.sum(n1,n2);
			op.sub(n1,n2);
			op.mul(n1,n2);
			op.div(n1,n2);
	}
}
