package files;

import java.io.File;

public class TestFolderDelete {

	public static void main(String[] args) {
		File file = new File("C:\\test1");

		if (file.exists()) { // check if the folder exists
			file.delete(); // this will delete "test1" folder
		}
	}

}
