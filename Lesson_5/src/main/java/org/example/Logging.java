package org.example;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {
    String fileName = "log.txt";
    Logger logger = Logger.getLogger(Logging.class.getName());
    FileHandler handler = new FileHandler(getFileName());
    SimpleFormatter form = new SimpleFormatter();

    public Logging(String fileName) throws Exception{
        this.fileName = fileName + ".txt";
        logger.addHandler(handler);
        handler.setFormatter(form);
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void log(String info) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathName = pathProject + "/" + getFileName();;
            File log = new File(pathName);
            if (log.createNewFile()) {
                System.out.println("log created");
            }
            else {
                logger.log(Level.INFO, info);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return "Логирование производится в файл: " + getFileName();
    }
}
