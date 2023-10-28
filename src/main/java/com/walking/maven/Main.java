package com.walking.maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

public class Main {
    private final static Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
            log.trace("Trace log message");
            log.debug("Debug log message");

            var infoStr = "'I'm working correctly!'";
            log.info("Info log message: {} Now is {}", infoStr, LocalDateTime.now());

            try {
                throw  new RuntimeException("!!!");
            } catch (Exception e) {
                log.error("Some error");
                log.error("Some error", e);
                log.error(e);
            }

            log.warn("Warn log message");
            log.fatal("Fatal log message");
    }
}