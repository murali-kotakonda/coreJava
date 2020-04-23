package clone;

import java.util.Map;

public class EmployeeClone2 implements Cloneable {
	
	private int id;

	private String name;
	
	private int projId;

	private String projName;

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 @Override
	 public Object clone() throws CloneNotSupportedException {
		 EmployeeClone2 c = new EmployeeClone2();
		 c.projId = this.projId;
		 c.projName = this.projName;
		 return c;
	 }

}