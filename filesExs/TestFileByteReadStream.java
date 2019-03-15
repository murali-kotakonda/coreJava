package filesExs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFileByteReadStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		readFile();
		//writeFile();
		
	}

	private static void writeFile() throws IOException {
		//specify file info
		File fileout = new File("D:\\1.txt");
		FileOutputStream fos=null;
			fos = new FileOutputStream(fileout);
			String read="hi User!Welcome";
			fos.write(read.getBytes());
			fos.write("\n".getBytes());
			fos.write(read.getBytes());
				fos.close();
	}

	private static void readFile()
			throws FileNotFoundException, IOException {
		//specify file info
		File fileIn = new File("C:\\Project\\testout.txt");
		
		FileInputStream fis=
				new FileInputStream(fileIn);
		BufferedReader br = 
				new BufferedReader
				(new  InputStreamReader(fis));
		try{
		String read;
		while((read = br.readLine())!=null){
			System.out.println(read);
		}
		}catch(Exception ex){
			
			
		}finally{
			fis.close();
			br.close();
		}
	}

}
