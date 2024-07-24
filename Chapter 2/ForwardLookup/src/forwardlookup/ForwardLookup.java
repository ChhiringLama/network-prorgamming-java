/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forwardlookup;

import java.net.*;

/**
 *
 * @author lamah
 */
public class ForwardLookup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress add = InetAddress.getByName("www.javatpoint.com");
            System.out.println(add);
        } catch (UnknownHostException ex){ 
            System.out.println("Could not find www javatpoint com");
        }
    }
}

