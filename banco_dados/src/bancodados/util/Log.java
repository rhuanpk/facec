package bancodados.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {

	public Logger logger;

	public Log(Object obj) {

		try {

			logger = Logger.getLogger(obj.getClass().getName());
			LogManager.getLogManager().reset();

			FileHandler fileHandler = new FileHandler("log/app.log", true);
			fileHandler.setFormatter(new SimpleFormatter());

			logger.addHandler(fileHandler);

		} catch (SecurityException e) {
			System.err.println("error in permission of log file: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("error in open/create log file: " + e.getMessage());
		}

	}

}
