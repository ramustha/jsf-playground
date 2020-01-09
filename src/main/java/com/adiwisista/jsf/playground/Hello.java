package com.adiwisista.jsf.playground;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@RequestScoped
public class Hello {
    private static final Logger log = Logger.getAnonymousLogger();
    private String name;
    private String message;

    public void createMessage() {
        log.log(Level.WARNING, "################ Warning");
        message = "Hello, " + name + "!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

}