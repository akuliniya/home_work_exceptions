package ru.otus.java;

import java.net.SocketException;
import java.sql.Connection;

public class Server {
    String serverAddress;
    ConnectionEmulator connection;

    public Server(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    ConnectionEmulator getConnection() throws Exception{
        return connection;
    }
}
