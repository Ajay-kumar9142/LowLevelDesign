package org.example.lowLevelDesign.lld.logger;

public abstract class LogHandler {

    LogLevel level;
    private LogHandler nextLogHandler;

    public void setNextLogHandler(LogHandler logHandler){
        this.nextLogHandler = logHandler;
    }

    public void log(LogLevel level, String msg, LogSinkSubject logSinkSubject){
        if(this.level.getLevel() == level.getLevel()){
            publishLog(msg, logSinkSubject);
        }
        if(nextLogHandler != null){
            nextLogHandler.log(level, msg, logSinkSubject);
        }
    }

    public abstract void publishLog(String msg, LogSinkSubject logSinkSubject);
}
