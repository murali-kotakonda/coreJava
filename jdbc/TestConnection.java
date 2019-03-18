package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con =null;	
		try {
				//1. loading driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//2. get conn obj
				 con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						"scott",
						"tiger");
				 
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
