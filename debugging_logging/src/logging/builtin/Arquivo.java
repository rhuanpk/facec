package logging.builtin;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Arquivo {
    static void main() throws IOException {
        Logger logger = Logger.getLogger(Arquivo.class.getName());
        LogManager.getLogManager().reset();

        FileHandler fileHandler = new FileHandler("/tmp/file.log");
        fileHandler.setFormatter(new SimpleFormatter());

        logger.addHandler(fileHandler);

        //logger.config("log de CONFIGURAÇÃO");
        //logger.fine("log de RASTREIO");
        logger.info("log de INFORMAÇÃO");
        logger.warning("log de AVISO");
        logger.severe("log de ERRO");
    }
}
