package other;

class Person {

	private static final Person obj = new Person();

	// private constructor to avoid client applications to use constructor
	private Person() {
	}

	public static Person getObj() {
		return obj;
	}
}
