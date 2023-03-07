package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    ServerSocket serverSocket;
    ArrayList<Socket> clients;
    DataOutputStream dataOutputStream;

    public Server() throws IOException {
        serverSocket = new ServerSocket(9000);

    }

    public void joinChat(Socket socket) {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(inputStream));
            String data = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (var client :
                clients) {
            InputStream inputStream = null;
            try {
                inputStream = client.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        clients.add(socket);
        System.out.println("Client added");
    }

}
