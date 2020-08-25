import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOper {
public static void main(String[] args) throws IOException {
	File inputFile = new File("C:\\Users\\i335484\\OneDrive - SAP SE\\Desktop\\DSC\\Thing Modeler.jmx");
	File tempFile = new File("C:\\Users\\i335484\\OneDrive - SAP SE\\Desktop\\DSC\\Thing Modeler1.jmx");

	BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

	String currentLine;

	while((currentLine = reader.readLine()) != null) {
	    // trim newline when comparing with lineToRemove
	    String trimmedLine = currentLine.trim();
	    if(trimmedLine.startsWith("{&quot;_time&quot;: &quot;")) continue;
	    writer.write(trimmedLine);
	}
	writer.close(); 
	reader.close(); 
	System.out.println("done");
}
}
