package annotatios.method;


class Person {
	
	@Config(value = 10)
	public void printData() {
		System.out.println("hello annotation");
	}
}
