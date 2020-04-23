package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {
	public static void main(String args[]) {
		File myfile = new File("C:\\test\\T1.java");

		Scanner k;

		try {
			k = new Scanner(myfile);

			while (k.hasNext()) {
				System.out.print(k.next());
			}

			k.close();

		}

		catch (IOException e) {
			System.out.println("Your file is not found anywhere! :O");
		}

	}
}
