/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopback;

import java.net.InetAddress;

/**
 *
 * @author lamah
 */
public class LoopBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            // Get the loopback address
            InetAddress loopback = InetAddress.getLoopbackAddress();
            System.out.println("Loopback Address: " + loopback.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error retrieving loopback address: " + e.getMessage());
        }
    }
    
}
