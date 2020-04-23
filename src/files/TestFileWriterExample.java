package files;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriterExample {
	public static void main(String args[]) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\testout.txt");
			fw.write("Hi\n   ");
			fw.write("Hello");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				System.out.println("file close failed.");
			}
		}
		System.out.println("Success...");
	}
}