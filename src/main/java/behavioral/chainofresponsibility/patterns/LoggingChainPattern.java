package behavioral.chainofresponsibility.patterns;

import behavioral.chainofresponsibility.logging.BaseLogger;
import behavioral.chainofresponsibility.logging.ConsoleLogger;
import behavioral.chainofresponsibility.logging.DBLogger;
import behavioral.chainofresponsibility.logging.FileLogger;

public class LoggingChainPattern {
    public static BaseLogger getLoggerChain() {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        DBLogger dbLogger = new DBLogger();
        FileLogger fileLogger = new FileLogger();

        consoleLogger.setNextChain(dbLogger);
        dbLogger.setNextChain(fileLogger);

        return consoleLogger;
    }
}
