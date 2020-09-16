package threads.Calculation2;

public class CalculatorThread extends Thread {

	//instance variables
	private String operation;
	private int num1;
	private int num2;
	

	public CalculatorThread(String operation, int num1, int num2) {
		this.operation = operation;
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		if (operation.equals("add")) {
			System.out.println("add "+ ( num1 + num2 ));
		} else if (operation.equals("sub")) {
			System.out.println("sub "+(num1 - num2));
		} else if (operation.equals("mul")) {
			System.out.println("mul "+num1 * num2);
		} else if (operation.equals("div")) {
			System.out.println("div "+num1 / num2);
		}
	}
}
