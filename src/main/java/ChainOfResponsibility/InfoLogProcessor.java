package ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == INFO){
            System.out.println("INFO: "+message);
        } else {
            super.log(logLevel, message);
        }
    }
}
