import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MiniTest {
	public static void main(String[] args) throws IOException {
		String data = new Minify().minify(getSampleJson());
		
		File tempFile = new File("C:\\Users\\i335484\\OneDrive - SAP SE\\Desktop\\DSC\\json1.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
		 writer.write(data);
		 writer.close();
		 System.out.println("done");
	}

	public static String getSampleJson() {
		return readLineByLineJava8("C:\\Users\\i335484\\OneDrive - SAP SE\\Desktop\\DSC\\json.txt");
	}

	private static String readLineByLineJava8(String filePath) {
		StringBuilder contentBuilder = new StringBuilder();

		try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
			stream.forEach(s -> contentBuilder.append(s).append("\n"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return contentBuilder.toString();
	}

}
