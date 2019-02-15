package inherit.multilevelEx;

public class TetInherit {
	public static void main(String[] args) {
		//create obj
		Staff staff = new Staff();
		
		//set data for inherited props
		 staff.setName("user1");
		 staff.setAge(17);
		 staff.setContractId("12345");
		 staff.setContractType("permanent");
		 staff.setId(1234);
		 staff.setPan("bnvpu56rd43");
		 staff.setPfNo("pf_1231313");
		 
		 //get the prop values
		 staff.displayEmp();	
		 staff.displayPerson();
		 staff.dispStaff();
	}
}
