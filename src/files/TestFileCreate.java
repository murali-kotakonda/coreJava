package files;

import java.io.File;
import java.io.IOException;

public class TestFileCreate {
	public static void main(String[] args) {
		//create a dir
		File file = new File("C:\\testProgs3");
		
		file.mkdir();
		
		//create a file
		file = new File("C:\\testProgs3\\test12.txt");
		try {
			if(!file.exists())
				file.createNewFile();
		} catch (IOException e) {
			System.out.println("file creation failed");
		}
	}

}
