package com.satish.monitoring.web.rest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
@Slf4j
public class LoggerResource {

    @GetMapping(value = "/error")
    public void logError() {
        log.error("It's not working");
    }

    @GetMapping(value = "/warn")
    public void logWarn() {
        log.warn("This is a warning");
    }

    @GetMapping(value = "/info")
    public void logInfo() {
        log.info("This is an info");
    }
}
