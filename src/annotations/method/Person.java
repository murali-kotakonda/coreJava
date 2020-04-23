package annotations.method;


class Person {
	
	@Size(value = 10)
	public void printData() {
		System.out.println("hello annotation");
	}
}
