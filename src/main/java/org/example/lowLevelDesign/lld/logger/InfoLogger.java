package org.example.lowLevelDesign.lld.logger;

public class InfoLogger extends LogHandler{

    public InfoLogger(LogLevel level){
        this.level = level;
    }
    @Override
    public void publishLog(String msg, LogSinkSubject logSinkSubject) {

    }
}
