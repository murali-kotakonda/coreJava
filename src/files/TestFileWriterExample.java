package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriterExample {
	public static void main(String args[]) throws IOException {
		File file = new File("C:\\test\\test1.txt");
		
		FileWriter fw = null;
		fw = new FileWriter(file);
		
		fw.write("Hi\n");
		fw.write("Hello welcome to java");
		
		fw.close();
		System.out.println("file write success");
	}
}