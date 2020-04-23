package serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String args[]) throws Exception {
		FileInputStream fis = new FileInputStream("obj1.txt");
		ObjectInputStream in = new ObjectInputStream(fis);
		Student s = (Student) in.readObject();
		System.out.println("desrialization successs");
		System.out.println("id ="+s.id + " , name = " + s.name);
		System.out.println("refno = "+s.refNo);
		in.close();
	}
}