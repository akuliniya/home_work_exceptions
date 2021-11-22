package ru.otus.java;

import java.net.SocketException;

public class SoundDataLoader {
    Server server;

    public void loadData(Server server) {
        try (ConnectionEmulator connection = server.getConnection()){
            throw new SocketException();
        } catch (SocketException e) {
            e.printStackTrace();
            System.err.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
