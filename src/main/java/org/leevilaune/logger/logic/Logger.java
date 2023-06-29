package org.leevilaune.logger.logic;

import java.time.LocalDateTime;

public class Logger {

    private final String base;
    private final String versionNumber;

    public Logger(String projectName, String versionNumber){

        this.base = "[" + projectName + "]";
        this.versionNumber = "[" + versionNumber + "]";
    }

    /***
     * Logs come action
     * @param action - description of action logged
     */
    public void logAction(String action){
        System.out.println(generateTimeStamp() + base + versionNumber + " " + action);
    }

    /***
     * Logs some error
     * @param error - description of error occurred
     */
    public void logError(String error){
        System.err.println(generateTimeStamp() + base + versionNumber + " " + error);
    }

    /***
     * Generates and formats timestamp used in logs
     * @return formatted string of timestamp
     */
    public String generateTimeStamp(){
        String timeStamp = LocalDateTime.now().toString();
        return "[" + timeStamp + "]";
    }
}
