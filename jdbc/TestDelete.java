package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
			try {
				//1. loading driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//2. get conn obj
				Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						"scott",
						"tiger");
				
				 
				//3. get statement obj
				Statement st = con.createStatement();
				
				
				//4. insert
				int count =st.executeUpdate("insert into employee values(16,'mnp111',15156)");
				if(count>0){
					System.out.println("data inserted");
				}else{
					System.out.println("insertio failed");
				}
				
				
				//5. update
				int countForUpdate =st.executeUpdate("update employee set name='krishna' where userid=13");
				if(countForUpdate>0){
					System.out.println("updated");
				}else{
					System.out.println("insertio failed");
				}
				
				
				//5. update
				int countFordelete =st.executeUpdate("delete from  employee  where userid=13");
				if(countFordelete>0){
					System.out.println("delted  inserted");
				}else{
					System.out.println("insertio failed");
				}
				
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException ");
			}
			 catch (SQLException ex) {
				 System.out.println("SQLException :"+ex.getMessage());
			}

	}

}
