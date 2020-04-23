package java8Features.stream;

public class Person {
	String name;
	int deptId;

	Person(String name, int dept) {
		this.name = name;
		this.deptId = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return name;
	}
}
