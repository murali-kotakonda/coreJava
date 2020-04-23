package xmlPushpa;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class Test {

	private static final Logger log = Logger.getLogger(Test.class);

	public static void main(String[] args) throws IOException {
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.DEBUG);

		PatternLayout layout = new PatternLayout("%d{ISO8601} [%t] %-5p %c %x - %m%n");

		rootLogger.addAppender(new FileAppender(layout,"logs.log"));
		try {
			RollingFileAppender fileAppender = new RollingFileAppender(layout, "demoApplication.log");

			rootLogger.addAppender(fileAppender);
		} catch (IOException e) {
			System.out.println("Failed to add appender !!");
		}
	}
}
