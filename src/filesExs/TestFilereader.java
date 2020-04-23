package filesExs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFilereader {
	public static void main(String args[]) throws IOException {
		String fileName = "C:\\test\\test.txt";
		File file = new File(fileName);
		FileReader fr =null;
		try {
			fr = new FileReader(file);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			fr.close();	
		}
	}
}