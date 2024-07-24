/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package macoflocalmachine;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author lamah
 */
public class MacOfLocalMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
            // Get the local host address
            InetAddress localHost = InetAddress.getLocalHost();
            
            // Get the network interface for the local host
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
            
            // Get the MAC address
            byte[] macAddressBytes = networkInterface.getHardwareAddress();
            
            // Convert the byte array to a human-readable MAC address
            //We can do String macAddress="" too, but String object are immutable meaning everytime we append soemthing to the
            //string we get new object thus not effecent in terms of memory
            StringBuilder macAddress = new StringBuilder();
            for (byte b : macAddressBytes) {
                //For loop iterate over each byte in macAddress byte
                macAddress.append(String.format("%02X:", b));
                //Each bytes "b" of the byte array is formated as %x->uppercase , 02 -> atelast two digit long padded with leading 0  
            }
            
            // Remove trailing colon
            if (macAddress.length() > 0) {
                macAddress.setLength(macAddress.length() - 1);
            }
            
            System.out.println("MAC Address: " + macAddress.toString());
        } catch (UnknownHostException | SocketException ex) {
            System.out.println("Error retrieving MAC address: " + ex.getMessage());
        }
    }
    
}
