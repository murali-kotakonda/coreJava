package files;

import java.io.File;

public class TestFileDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = 
				new File
				("D:\\testProgs3\\test12.txt");
		boolean delete = file.delete();

	}

}
