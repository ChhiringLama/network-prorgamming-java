/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spamcheck;

import java.net.*;

/**
 *
 * @author lamah
 */
public class SpamCheck {

    //Create blackhole variable
    private static final String blkhole = "spamhaus.org/sbl";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic her
        for (String arg : args) {
            if (isSpammer(arg)) {
                System.out.println(arg + " is a spammer");
            } else {
                System.out.println(arg + " appears legitimate");
            }
        }
    }

    private static boolean isSpammer(String args) {
        try {
            InetAddress add = InetAddress.getByName(args);
            
            //fetch the address to convert it
            byte[] quad = add.getAddress();
            
            //Store the domain into the quiery, the query variable will be appended with revered IP address to this domain
            String query = blkhole;
            
            //Reverse the ip address from byte to query
            for (byte octet : quad) {
                int unsignedByte = octet < 0 ? octet + 256 : octet;
                query = unsignedByte + "." + query;
            }
            //query is obtained, now we get it by getByName() method, if successfull it returns true 
            InetAddress.getByName(query);
            return true;
        } catch (UnknownHostException e) {
            return false;
        }
    }
}

//Program takes the argument from main method in command line interface
//Arguments are captured by args array of the main method

//when using apachenetbeans 
//Open properties of the project, go to argument and enter an ip
// 192.168.1.1 for example

