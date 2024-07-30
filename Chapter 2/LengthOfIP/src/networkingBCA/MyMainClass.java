/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package networkingBCA;

import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lamah
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress add = InetAddress.getByName("www.facebook.com");
            byte[] address = add.getAddress();
  
            System.out.println(address);

            if (address.length == 4) {
                System.out.println("IPv4");
            } else {
                System.out.println("IPv6");
            }
        } catch (UnknownHostException ex) {
            System.out.print("Host not found");
        }
    }

}
