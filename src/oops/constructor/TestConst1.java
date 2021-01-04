package oops.constructor;

public class TestConst1 {
public static void main(String[] args) {
	Person p1 = new Person();// calls zero-arg constr
	Person p2 = new Person(39, "user5");// calls 2-arg constr
	Person p3 = new Person(20004,32, "user4");// calls 3-arg constr
}
}
