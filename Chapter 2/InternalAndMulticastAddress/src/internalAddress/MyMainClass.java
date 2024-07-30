/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package internalAddress;

import java.net.*;
/**
 *
 * @author lamah
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myAdd=InetAddress.getByName("192.168.0.5");
        if(myAdd.isSiteLocalAddress()){
            System.out.print("The address is Site local address");
        }else{
            System.out.print("The address is not site local address");
        }
    }
    
}
