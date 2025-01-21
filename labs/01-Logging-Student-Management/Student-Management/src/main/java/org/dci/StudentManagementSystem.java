package org.dci;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class StudentManagementSystem {

    private static final Logger logger = Logger.getLogger(StudentManagementSystem.class.getName());
    private List<String> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
        setupLogger();
    }

    private static void setupLogger() {
        // TODO: Configure the logger

        // 1. Set the global logging level.
        logger.setLevel(Level.ALL);

        // 2. Add a ConsoleHandler to log messages to the console.
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);

        // 3. Add a FileHandler to log messages to a file named "students.log".
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("students.log", true);
            fileHandler.setLevel(Level.ALL);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 4. Use SimpleFormatter to format the log messages.
        fileHandler.setFormatter(new CustomFormatter());

    }

    public void addStudent(String studentName) {
        // TODO: Add the student to the list and log an INFO message.
        students.add(studentName);
        logger.log(Level.FINE, "Student {0} has been added", studentName);
    }

    public void removeStudent(String studentName) {
        // TODO: Remove the student from the list if they exist.
        // Log a WARNING message if the student does not exist.
        if(!students.remove(studentName)) {
            logger.log(Level.WARNING, "Student {0} does not exist in the list", studentName);
        }
    }

    public int getStudentCount() {
        // TODO: Log a FINE message indicating the count is being fetched.
        // Return the current number of students in the system.
        logger.log(Level.FINE, "Number of Students is being fetched");
        return students.size();
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        // TODO: Add test cases to:
        // 1. Add students.
        sms.addStudent("Kai");

        // 2. Remove students.
        sms.removeStudent("Martin");
        sms.addStudent("Kathrin");
        sms.removeStudent("Kathrin");
        // 3. Print the total number of students.
        sms.addStudent("Omar");
        System.out.println(sms.getStudentCount());
        // Observe how logs are generated at different levels.
    }
}
