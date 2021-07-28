package exception;

import java.sql.SQLException;
import java.util.Scanner;

/**
 Throwing checked exception : SQLException
 */
public class Ex9 {
	public static void main(String[] args) throws SQLException {// handle exception
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no1");
		int num1 = sc.nextInt();

		System.out.println("enter no2");
		int num2 = sc.nextInt();

		int res = getDivisionResult(num1, num2);
		System.out.println("Result = " + res);

	}

	public static int getDivisionResult(int x, int y) throws  SQLException
	{// throw exception
		if (y == 0) {
			SQLException ex = new SQLException("Denominator cannot be zero");
			throw ex;
		}

		int r = x / y;
		return r;
	}
}


//two choice:
//1.handle exception try + catch
//2.done handle exception using throws keyword

