package logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

public class LoggingExample {

    private static final String LOG_FLE_NAME = "logger.log";
	static Logger logger = Logger.getLogger(LoggingExample.class.getName());
    
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
        } catch (SecurityException | IOException e1) {
            e1.printStackTrace();
        }
        logger.setLevel(Level.FINE);
        logger.addHandler(new StreamHandler());
        try {
            Handler fileHandler = new FileHandler(LOG_FLE_NAME, Integer.MAX_VALUE, 1);
            fileHandler.setFormatter(getFormatter());
            fileHandler.setFilter(getFilter());
            logger.addHandler(fileHandler);
            logger.info("Hello");
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

	private static Filter getFilter() {
		return new Filter() {
			
			@Override
			public boolean isLoggable(LogRecord log) {
				//don't log CONFIG logs in file
				if(log.getLevel() == Level.CONFIG) return false;
				return true;
			}
		};
	}

	private static Formatter getFormatter() {
		return new Formatter() {
			@Override
			public String format(LogRecord record) {

		        return record.getSourceClassName()+"."
		                +record.getSourceMethodName()+"-"
		                +new Date(record.getMillis())+"::"
		                +record.getMessage()+"\n";
		    
			}
		};
	}

}
