package com.metehanmengen.week3.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Mail loglandı " + message);
    }
}
