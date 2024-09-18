package ChainOfResponsibility;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        LogProcessor processor=new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));

        processor.log(LogProcessor.DEBUG,"Need to debug");
        processor.log(LogProcessor.ERROR,"Exception Happens");
        processor.log(LogProcessor.INFO,"Just for info");

        //Chain of Responsibility is basically used for logging process or in aspect oriented programming.
    }
}
