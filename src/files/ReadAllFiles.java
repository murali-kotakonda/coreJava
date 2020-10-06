package files;

import java.io.File;

/**
  
-> How to determine if the file obj represents a file or folder??
boolean isFile = file.isFile();
boolean isDir = file.isDirectory();


Read all files/folders names in the given folder
use listFiles() method to read all the files/Folder ; this returns the array of files obj.
  
 */
public class ReadAllFiles {
	public static void main(String[] args) {

		File f1 = new File("C://test");
		File[] listFiles = f1.listFiles();
		for (File f : listFiles) {
			boolean isFile = f.isFile();
			boolean isDir = f.isDirectory();
			//  isFile ? "File name = " : "folder name =  " 
			if(isFile) {
				System.out.println("File name = " + f.getName());
			}else{
				System.out.println("folder name = " + f.getName());
			}
			
			// System.out.println(( isFile ? "File name = " : "folder name =  " ) + f.getName());
		}
	}
}
