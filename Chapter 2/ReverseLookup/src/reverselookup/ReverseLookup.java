/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverselookup;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author lamah
 */

//This is also called DNS lookup or IP lookup
public class ReverseLookup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            InetAddress addr = InetAddress.getByName("157.240.22.35"); 
            String hostname = addr.getHostName();
            System.out.println("Hostname: " + hostname);
        } catch (UnknownHostException ex) {
            System.out.println("Could not find hostname for the IP address");
        }
    }
    
}
