package filesExs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriterExample {
	public static void main(String args[]) throws IOException {
		String details = "write file using filewriter";
		File file = new File("C:\\Project\\testout.txt");
		FileWriter fw=null;
		try {
			fw = new FileWriter(file);
			
			if(file.canWrite()){
				fw.write("Hi user!!!   ");
				fw.write("\r\n");
				fw.write(details);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			fw.close();
		}
		
		System.out.println("Success...");
	}
}