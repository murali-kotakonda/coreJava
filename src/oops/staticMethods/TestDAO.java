package oops.staticMethods;

public class TestDAO {
public static void main(String[] args) {
	Dao.showCount(); // call the static method , prints 900
	Dao.updateCount(90); // add 90 to the static variable
	Dao.showCount(); // prints 990
}

}