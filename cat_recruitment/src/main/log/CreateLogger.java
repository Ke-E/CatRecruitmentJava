package main.log;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CreateLogger {

	public Logger getLogger() throws Exception {

		Logger logger = Logger.getLogger(CreateLogger.class.getName());
		FileHandler fileHandler = new FileHandler("sample.log", true);
		fileHandler.setLevel(Level.INFO);
		fileHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(fileHandler);

		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.INFO);
		logger.addHandler(consoleHandler);

		return logger;


	}
}
