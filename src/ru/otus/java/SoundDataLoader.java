package ru.otus.java;

public class SoundDataLoader {
    Server server;

    public void loadData(Server server) {
        try (ConnectionEmulator connection = server.getConnection()){
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
