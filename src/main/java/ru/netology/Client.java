package ru.netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try (Socket clientSocket = new Socket("localhost", Server.PORT);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             ) {
             out.println("Egor");
            System.out.println(in.readLine());

        }catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
