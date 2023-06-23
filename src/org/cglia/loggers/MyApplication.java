package org.cglia.loggers;

import java.util.logging.Logger;

public class MyApplication {
	
    private static final Logger LOGGER = Logger.getLogger(MyApplication.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Starting MyApplication...");
        try {
            int x=10, y=0;
            int z = x/y;
            System.out.println(z+"\nError....");
        } catch (Exception e) {
            LOGGER.severe("An error occurred: " + e.getMessage());
        }
        LOGGER.info("MyApplication completed.");
    }
}
