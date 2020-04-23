package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestSingleSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id to search");
		
		System.out.println("enter id:");
		int id = sc.nextInt();
		Employee emp = selectById(id);
		
		if(emp==null){
			System.out.println("emp id not found!!");
		}else{
			System.out.println(emp);
		}

	}

	private static Employee selectById(int id) {
		Employee employee= null;
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
			PreparedStatement st = con.prepareStatement
					("select * from employee where USERID=?");
		
			
			st.setInt(1, id);
			
			//4. select
			 
			ResultSet rs = st.executeQuery();
				if(rs.next()){
					employee = new Employee();
					employee.setId(rs.getInt("USERID")); 
					employee.setName(rs.getString("name"));
					employee.setSal(rs.getInt("SALARYINFO"));
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
		return employee;
}

}
