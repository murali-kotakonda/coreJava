package serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student(5000, "user2", 1234);
		FileOutputStream fout = new FileOutputStream("obj1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}
}

/*
 * composition asociatio
 */