package com.example.logging

import org.apache.logging.log4j.LogManager
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoggingApplication : ApplicationRunner {

    private val logger = LogManager.getLogger(LoggingApplication::class.java)

    override fun run(args: ApplicationArguments?) {
        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
    }
}

fun main(args: Array<String>) {
    runApplication<LoggingApplication>(*args)
}
