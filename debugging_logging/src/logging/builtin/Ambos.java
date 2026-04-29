package logging.builtin;

import java.io.IOException;
import java.util.logging.*;

public class Ambos {
    static void main() throws IOException {
        Logger logger = Logger.getLogger(Ambos.class.getName());
        LogManager.getLogManager().reset();
        ConsoleHandler consoleHandler = new ConsoleHandler();

        FileHandler fileHandler = new FileHandler("/tmp/file.log");
        fileHandler.setFormatter(new SimpleFormatter());

        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);

        //logger.config("log de CONFIGURAÇÃO");
        //logger.fine("log de RASTREIO");
        logger.info("log de INFORMAÇÃO");
        logger.warning("log de AVISO");
        logger.severe("log de ERRO");
    }
}
