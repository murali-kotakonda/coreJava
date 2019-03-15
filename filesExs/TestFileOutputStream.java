package filesExs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File fileOut = new File("C:\\Project\\output.csv");
		FileOutputStream fos = new FileOutputStream(fileOut);
		try {
			fos.write("krishns,28,1313".getBytes());
			fos.write("\r\n".getBytes());
			fos.write("where ae you?".getBytes());
		} catch (Exception ex) {

		} finally {
			fos.close();
		}
	}

}
