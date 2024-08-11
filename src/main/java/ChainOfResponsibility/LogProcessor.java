package ChainOfResponsibility;

import java.util.logging.Logger;

public abstract class LogProcessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    LogProcessor nextprocessor;

    LogProcessor(LogProcessor nextProcessor) {
        this.nextprocessor = nextProcessor;
    }

    public void log(int logLevel, String message) {
        if(nextprocessor != null) {
            nextprocessor.log(logLevel, message);
        }
    }
}
