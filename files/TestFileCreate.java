package files;

import java.io.File;
import java.io.IOException;

public class TestFileCreate {
	public static void main(String[] args) {
		//create a dir
		
		File file = new File("D:\\testProgs3");
		
		file.mkdir();
		
		
		
		//create a file
		file = new File("D:\\testProgs3\\test12.txt");
	 
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
