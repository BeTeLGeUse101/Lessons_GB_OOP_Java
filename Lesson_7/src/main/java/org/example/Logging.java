package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private final Logger logger;

    public Logging() {
        logger = Logger.getLogger(Logging.class.getName());
    }

    public void logStart(String log) {
        logger.log(Level.INFO, log);
    }
}
