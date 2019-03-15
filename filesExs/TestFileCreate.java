package filesExs;

import java.io.File;
import java.io.IOException;

public class TestFileCreate {
	public static void main(String[] args) {
		//create a dir
		File file = new File("D:\\myFolder");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		file.mkdir();
		
		
		//create a file
		file = new File("D:\\myFolder\\test12.txt");
		try {
			file.createNewFile();
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}

}
