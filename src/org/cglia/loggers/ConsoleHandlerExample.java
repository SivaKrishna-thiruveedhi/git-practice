package org.cglia.loggers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleHandlerExample {

    private static final Logger logger = Logger.getLogger(ConsoleHandlerExample.class.getName());

    public static void main(String[] args) {

        // Create a console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();

        // Set the logging level for the console handler
        consoleHandler.setLevel(Level.WARNING);

        // Add the console handler to the logger
        logger.addHandler(consoleHandler);

        // Log some messages
        
        logger.severe("This is a severe message");
        logger.warning("This is a warning message");
        logger.info("This is an info message");
    }
}
