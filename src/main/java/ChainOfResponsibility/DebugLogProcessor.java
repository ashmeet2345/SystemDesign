package ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG: "+message);
        } else {
            super.log(logLevel, message);
        }
    }
}
