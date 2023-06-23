package org.cglia.loggers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandlerExample {

    private static final Logger logger = Logger.getLogger(FileHandlerExample.class.getName());

    public static void main(String[] args) throws IOException {

        // Create a file handler
        FileHandler fileHandler = new FileHandler("D://log.txt");

        // Set the logging level for the file handler
        fileHandler.setLevel(Level.ALL);

        // Add the file handler to the logger
        logger.addHandler(fileHandler);

        // Log some messages
        logger.severe("This is a severe message");
        logger.warning("This is a warning message");
        logger.info("This is an info message");
        logger.config("This is a config message");
        logger.fine("This is a fine message");
        logger.finer("This is a finer message");
        logger.finest("This is the finest message");

        // Close the file handler
        fileHandler.close();
    }
}
