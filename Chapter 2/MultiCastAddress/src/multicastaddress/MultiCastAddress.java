/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multicastaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author lamah
 */
public class MultiCastAddress {

    /**
     * @param args    
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myAdd=InetAddress.getByName("224.0.0.0");
        if(myAdd.isMulticastAddress()){
            System.out.println("The address is multicast address");
        }else{
            System.out.println("The address is not multicast address");
        }
    }
    
}
