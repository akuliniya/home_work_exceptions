package ru.otus.java;

public interface ConnectionEmulator extends AutoCloseable {

    @Override
    void close() throws Exception;
}
