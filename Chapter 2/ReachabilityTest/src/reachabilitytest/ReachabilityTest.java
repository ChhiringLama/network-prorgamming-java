/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reachabilitytest;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author lamah
 */
public class ReachabilityTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            // Specify the address you want to check
            InetAddress address = InetAddress.getByName("google.com");

            // Check if the address is reachable within the timeout period (in milliseconds)
            boolean reachable = address.isReachable(5000);

            if (reachable) {
                System.out.println(address + " is reachable.");
            } else {
                System.out.println(address + " is not reachable.");
            }
        } catch (IOException e) {
        }
    }
    
}
