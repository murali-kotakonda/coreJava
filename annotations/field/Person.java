package annotations.field;

public class Person {
	
	@FieldConfig(size=25)
	private String id;

	@FieldConfig(size=10)
	private String name;

	public Person(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}