package logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NativoTerminal {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(NativoTerminal.class.getName());

		logger.log(Level.ALL, "level ALL");
		logger.log(Level.CONFIG, "level CONFIG");
		logger.log(Level.FINE, "level FINE");
		logger.log(Level.FINER, "level FINER");
		logger.log(Level.FINEST, "level FINEST");
		logger.log(Level.INFO, "level INFO");
		logger.log(Level.SEVERE, "level SEVERE");
		logger.log(Level.WARNING, "level WARNING");

	}

}
