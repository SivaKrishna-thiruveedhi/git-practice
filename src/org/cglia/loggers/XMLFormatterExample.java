package org.cglia.loggers;

import java.util.logging.*;

public class XMLFormatterExample {

    private static final Logger logger = Logger.getLogger(XMLFormatterExample.class.getName());

    public static void main(String[] args) {

        // Create a console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();

        // Create an XMLFormatter
        XMLFormatter xmlFormatter = new XMLFormatter();

        // Set the formatter for the console handler
        consoleHandler.setFormatter(xmlFormatter);

        // Add the console handler to the logger
        logger.addHandler(consoleHandler);

        // Log some messages
        logger.severe("This is a severe message");
        logger.warning("This is a warning message");
        logger.info("This is an info message");
        logger.config("This is a config message");
        logger.fine("This is a fine message");
        logger.finer("This is a finer message");
        logger.finest("This is the finest message");
    }
}

