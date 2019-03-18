package oops.overload1;

public class TestCalc {
public static void main(String[] args) {
	 Calculator c = new Calculator();
	 c.add(10,20);
	 c.add(12.2f,5);
	 c.add(1,2,3);
	 c.add(5, 12.2f);
}

}
