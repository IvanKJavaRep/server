package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            Server server = new Server();
            Client client = new Client(new Socket("localhost", 9000), "Petr");
            Client client1 = new Client(new Socket("localhost", 9000), "Alexandr");
            server.joinChat(client.socket);
            server.joinChat(client1.socket);
        } catch (Exception ex) {

        }
    }
}