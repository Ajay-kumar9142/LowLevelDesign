package org.example.lowLevelDesign.behavioralDesignPattern.chainOfResponsebility.loggerSystem;

public class LoggerChain {
    public static Logger getLoggerChain(){
        Logger infoLogger = new InfoLogger(Logger.INFO);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }
}
