package filesExs;

import java.io.File;

public class TestFileDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = 
				new File
				("D:\\myFolder\\test12.txt");
		boolean delete = file.delete();
		if(delete){
			System.out.println("file deleted");
		}else{
			System.out.println("file not deleted");
		}
	}

}
