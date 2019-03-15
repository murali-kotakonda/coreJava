package filesExs;

import java.io.File;
import java.io.IOException;

public class FileEx {
public static void main(String[] args) throws IOException {
	File f1 = new File("C://test");
	f1.mkdir();
	
	File f = new File("C://test//hello.txt");
	
	if(!f.exists())
		f.createNewFile();
	boolean canRead = f.canRead();
	boolean canWrite = f.canWrite();
	
	System.out.println(canRead);
	System.out.println(canWrite);
	
	f.delete();
	
}
}
