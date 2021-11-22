package ru.otus.java;

public class NoSuchSoundException extends Exception {
    String message;
    Throwable cause;

    public NoSuchSoundException(Throwable cause) {
        this.message = "Извините, звук не найден.";
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public synchronized Throwable getCause() {
        return cause;
    }

}
