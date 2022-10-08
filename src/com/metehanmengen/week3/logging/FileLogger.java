package com.metehanmengen.week3.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Dosya loglandı" + message);
    }
}
