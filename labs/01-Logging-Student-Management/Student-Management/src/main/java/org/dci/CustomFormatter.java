package org.dci;

import java.util.Arrays;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return "Time: " + record.getMillis() + " - Logging Level: " + record.getLevel() +
               " - Thread ID: " + record.getLongThreadID() + " - Logger Name: " + record.getLoggerName() +
               " - Message: " + record.getMessage() +
               " - Parameters: " + Arrays.toString(record.getParameters()) +
               "\n";
    }
}
