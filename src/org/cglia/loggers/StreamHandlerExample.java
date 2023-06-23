package org.cglia.loggers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class StreamHandlerExample {

    private static final Logger logger = Logger.getLogger(StreamHandlerExample.class.getName());

    public static void main(String[] args) throws IOException {

        // Create a stream handler that writes to System.out
        StreamHandler streamHandler = new StreamHandler(System.out, new SimpleFormatter());

        // Set the logging level for the stream handler
        streamHandler.setLevel(Level.SEVERE);

        // Add the stream handler to the logger
        logger.addHandler(streamHandler);

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
