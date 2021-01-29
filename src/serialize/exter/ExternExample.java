package serialize.exter;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person implements Externalizable {
	int id;
	String name;
	static int age;
	

	public Person() {
		System.out.println("Default Constructor ");
	}

	public Person(String name, int id) {
		this.name = name;
		this.id = id;
		age = 10;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
		out.writeInt(id);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		id = in.readInt();
		age = in.readInt();
	}

	@Override
	public String toString() {
		return ("Name: " + name + "\n" + "Id: " + id + "\n" + "Age: " + age);
	}
}


public class ExternExample {
	public static void main(String[] args) {
		Person p1 = new Person("Shubham", 1995);
		serialize(p1);
		desrialize();
	}

	private static void serialize(Person car) {
		try {
			FileOutputStream fo = new FileOutputStream("test.txt");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(car);
			so.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void desrialize() {
		Person p2 = null;
		try {
			FileInputStream fi = new FileInputStream("test.txt");
			ObjectInputStream si = new ObjectInputStream(fi);
			p2 = (Person) si.readObject();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Data = " + p2);
	}
}