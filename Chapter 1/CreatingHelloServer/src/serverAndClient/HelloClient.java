/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverAndClient;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class HelloClient {
    public static void main(String[] args) {
        try (Socket clientsoc = new Socket("localhost", 2323)) {
            //Now we have to connect to server "localhost" in this case and can send message to 1099 port
            
            PrintWriter out = new PrintWriter(clientsoc.getOutputStream(), true);
            //Creating a printWrite object that writes the data to a sockets output stream
                //getOutputStream() -> Retrieves the output stream associated with the socket object, 
                // Meaning we are obtaining the stream that allows us to send data from client to server
                // in this case clientSoc is the socket object.
                
                
            out.println("Hello, server!");
            System.out.println("Message sent to server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}