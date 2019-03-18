package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMultipleSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> emps = getAllEmployees();
		
		if(emps==null){
			System.out.println("emp table is empty!!");
		}else{
			
			
			for(Employee e: emps){
				System.out.println(e);
			}
 		}

	}

	private static List<Employee> getAllEmployees( ) {
		List<Employee> employees = new ArrayList<Employee>();
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
					("select * from employee");
		
			//4. select
			ResultSet rs = st.executeQuery();
				while(rs.next()){
					Employee employee = new Employee();
					employee.setId(rs.getInt("USERID")); 
					employee.setName(rs.getString("name"));
					employee.setSal(rs.getInt("SALARYINFO"));
					
					employees.add(employee);
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
		return employees;
}

}
