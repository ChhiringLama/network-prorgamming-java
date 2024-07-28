/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gettersdemo;

import java.net.*;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 *
 * @author lamah
 */
public class GettersDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //1 getLocalHost(); Returns instance the local host name and address 
            //getHostAddress -> Return a string of IP address
            
            InetAddress add = InetAddress.getLocalHost();
            System.out.println("Hostname and Address: "+ add);
            //IP address
            System.out.println("IP only:" +add.getHostAddress());
            
            
            //2 getbyName Return instance of hostname add and Name  
            // getHostname Returns the name of the IP address
            InetAddress newAdd=InetAddress.getByName("Localhost");
            System.out.println(newAdd.getHostName());
            System.out.println(newAdd);
            
            
            //3 I
        } catch (UnknownHostException e) {
            System.out.print("Could'nt find the host");
        }
    }

}
