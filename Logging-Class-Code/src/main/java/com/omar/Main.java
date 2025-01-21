package com.omar;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.*;

public class Main {
//    always configure our logger to be static and final
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    private static Map<String, Boolean> books = new HashMap<>();

    public static void main(String[] args) throws IOException {
        setUpLogger();
        initializeBooks();
    }

    public static void setUpLogger() throws IOException {

//     2 main 3rd party Logging framework:
//        1. Log4j
//        2. Logback
//        3. SFL4J


//        by default the log level is set to Info

        logger.setLevel(Level.ALL);

//        create the console handler and attach it to the logger
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);

        FileHandler fileHandler = new FileHandler("library.log",true);
        fileHandler.setLevel(Level.WARNING);
        fileHandler.setFormatter(new XMLFormatter());
        logger.addHandler(fileHandler);

//        logger.info("Information Logged in my application");
//        logger.severe("Severe Error in the code out of memory");
//        logger.log(Level.WARNING,"Warning username incorrect");
//
//        logger.config("Configuration settings: ask Maryam");

//        2 fundemental places where we will mostly be logging in java
//            1. console (terminal)
//            2. file
    }

    public static void initializeBooks(){
        books.put("Catcher and the Rye",true);
        books.put("Java Porgramming",false);
        books.put("Harry Potter",true);
        books.put("Data Science", false);

        logger.config("Populating database upon boot");
    }

//    borrowing a book
//    returning a book
//    check if library is empty (health check)
//    Get all the available books
//    get available book count
//    custom formatting

}