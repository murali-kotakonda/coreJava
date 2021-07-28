package interviewQuestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snippet {
	public static void main(String[] args) throws IOException {
	            File f=new File("test.xml");
	            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
	            String content=null;
	
	            while((content=reader.readLine())!=null)
	            {
	                content = content.replaceFirst("some text", "new text");
	                System.out.println(content);
	            }
	
	        }  
}

