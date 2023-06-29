package org.leevilaune.logger;

import org.leevilaune.logger.logic.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger("ActionLogger", "a0.0.1");
        logger.logAction("testing logging");
        logger.logError("testing error");
    }
}