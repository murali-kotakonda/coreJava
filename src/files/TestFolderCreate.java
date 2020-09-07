package files;

import java.io.File;
//Create a folder "test1" in C drive
public class TestFolderCreate {
	public static void main(String[] args) {
		//create a dir
		File file = new File("C:\\test1");
		
		file.mkdir();
		
	}

}
