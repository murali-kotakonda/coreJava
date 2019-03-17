package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProps {
	public static void main(String[] args) throws IOException {
		InputStream input= new FileInputStream("C:\\Project\\config.properties");

		// load a properties file
		Properties prop = new Properties();
		prop.load(input);

		// get the property value and print it out
		
		String results = prop.getProperty("reultsperpage");
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("pass"));
		System.out.println(prop.getProperty("IPADDRESS"));

		System.out.println(prop.getProperty("portNo"));

		System.out.println(prop.getProperty("dbName"));

		
		System.out.println(results);
 		input.close();
	}
}