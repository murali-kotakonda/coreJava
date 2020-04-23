package serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student(5000, "user2", 1234);
		
		File f = new File("obj1.txt");
		
		FileOutputStream fout = new FileOutputStream(f);
		
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		
		out.flush();
		System.out.println("success");
	}
}

/*
 * composition asociatio
 */