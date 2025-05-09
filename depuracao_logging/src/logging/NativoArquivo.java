package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class NativoArquivo {

	public static void main(String[] args) throws SecurityException, IOException {

		Logger logger = Logger.getLogger(NativoArquivo.class.getName());
		LogManager.getLogManager().reset();

		FileHandler fileHandler = new FileHandler("/tmp/tmp/file.log");

		fileHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(fileHandler);

		logger.info("mensagem de INFORMAÇÃO");
		logger.fine("mensagem de TRACE");
		logger.warning("mensagem de AVISO");
		logger.severe("mensagem de ERRO");
		logger.config("mensagem de CONFIGURAÇÃO");

	}

}
