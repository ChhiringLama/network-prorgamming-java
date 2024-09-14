/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serverAndClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class CreatingHelloServer {

    public static void main(String[] args) {
        System.out.println("Simple Echo Server");
        //Step 1 : server set up that listend to request coming from port 1099

        try (ServerSocket serverSoc = new ServerSocket(2323)) {
            // Try block with resources as an argument means, we dont have to make finally block with code that
            // that cleans up the resources by closing them for example clientSoc.close();
            //Thus it automatically closes the resources in the argument

            //Step 2 Waiting for connection
            System.out.println("Waiting for connection...");
            Socket clientSoc = serverSoc.accept();
            //serverSoc.accept() waits for the client to connect to server on the port 1099

            //Optional step for reading the recived printWriter data
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSoc.getInputStream()));
            String message = in.readLine();
            System.out.println("Received from client: " + message);

            //Step 3 : return connection succesful to client
            System.out.print("Connected to client");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

//Using apache netbeads:
//To run the file,
//Execute the server first,
//Execute the client second, 
