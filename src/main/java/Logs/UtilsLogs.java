package Logs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class UtilsLogs {
    public static Logger createLogger(String path) {
        Logger logger = Logger.getLogger("PetClinic");
        FileHandler fh;
        {
            try {
                fh = new FileHandler(path);
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return logger;
    }

}
