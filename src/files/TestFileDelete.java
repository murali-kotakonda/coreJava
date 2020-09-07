package files;

import java.io.File;

/**
1.create file obj by specifying file path. [ make sure folder and file exists ]
2. call delete(); method

 */
public class TestFileDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("C:\\test\\test12.txt");

		if (file.exists()) {
			file.delete();
			System.out.println("file deleted");
		}else {
			System.out.println("file doesnt exists");
		}
		
	}

}
