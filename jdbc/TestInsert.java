package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestInsert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		insertWithStatementObj();
		//insertWithPreparedStatementObj();

	}

	private static void insertWithPreparedStatementObj() {
		Connection con = null;
		try {
			//1. loading driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. get conn obj
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
			con.setAutoCommit(false);
			
			//3. get statement obj
			PreparedStatement st = con.prepareStatement
					("insert into employee values(?,?,?)");
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter employee details to sva einto db");
			System.out.println("enter name:");
			String name = sc.next();
			
			
			System.out.println("enter id:");
			int id = sc.nextInt();
			
			System.out.println("enter sal:");
			int sal = sc.nextInt();
			
			st.setInt(1, id);
			st.setString(2, name);
			st.setInt(3,sal);
			
			//4. insert
			int count =st.executeUpdate();
			if(count>0){
				System.out.println("data inserted");
			}else{
				System.out.println("insertio failed");
			}
			
		 
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException ");
		}
		 catch (SQLException ex) {
			 System.out.println("SQLException :"+ex.getMessage());
		}finally{
			if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("error while closing conn");
				}
			}
		}
}

	private static void insertWithStatementObj() {
		Connection con = null;
			try {
				//1. loading driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//2. get conn obj
				con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						"scott",
						"tiger");
				//3. get statement obj
				Statement st = con.createStatement();
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter employee details to sva einto db");
				System.out.println("enter name:");
				String name = sc.next();
				
				
				System.out.println("enter id:");
				int id = sc.nextInt();
				
				System.out.println("enter sal:");
				int sal = sc.nextInt();
				
				//4. insert
				int count =st.executeUpdate("insert into " +
						"employee " +
						"values" +
						"("+id+",'"+name+"',"+sal+")");
				if(count>0){
					System.out.println("data inserted");
				}else{
					System.out.println("insertio failed");
				}
				
			 
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException ");
			}
			 catch (SQLException ex) {
				 System.out.println("SQLException :"+ex.getMessage());
			}finally{
				if(con!=null){
					try {
						con.close();
					} catch (SQLException e) {
						System.out.println("error while closing conn");
					}
				}
			}
	}

}
