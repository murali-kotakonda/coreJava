package files;

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
		writeFile();
		
	}

	private static void writeFile() {
		//specify file info
		File fileout = new File("D:\\1.txt");
		
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream(fileout);
			String read="hi hopw atre dafn";
			fos.write(read.getBytes());
			fos.write("\n".getBytes());
			fos.write(read.getBytes());
		}catch(Exception ex){
			
			
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void readFile()
			throws FileNotFoundException, IOException {
		//specify file info
		File fileIn = new File("D:\\test.txt");
		
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
