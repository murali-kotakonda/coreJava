package filesExs;

import java.io.File;

public class ReadAllFiles {
	public static void main(String[] args) {

		File f1 = new File("C://test");
		File[] listFiles = f1.listFiles();
		for (File f : listFiles) {
			boolean isFile = f.isFile();
			boolean isDir = f.isDirectory();
			
			System.out.println(( isFile ?"FILE " :"DIR " ) + f.getName());
		}
	}
}
