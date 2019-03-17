package exceptions;

import java.sql.SQLException;
import java.util.Scanner;

public class TestThrow2 {
	/**
	 * @param args
	 *            method will hanlde the ArithmeticException exceptiobn
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = 10;
		int num2 = 0;

		int output=0;
		try {
			output = m2(num1, num2);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("invalid input");
			System.out.println(e.getMessage());
		}
		System.out.println("output = " + output);

	}

	private static int m2(int num1, int num2) throws SQLException {
		return m3(num1, num2);
	}
	
	private static int m3(int num1, int num2) throws SQLException {
		return m4(num1, num2);
	}

	private static int m4(int num1, int num2) throws SQLException {
		if (num2 == 0) {
			SQLException ex = new SQLException("num2 cannot be 0");
			throw ex;
		}
		return num1 / num2;
	}
}
