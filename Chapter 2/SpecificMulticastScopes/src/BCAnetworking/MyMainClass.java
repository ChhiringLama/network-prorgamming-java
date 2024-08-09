/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BCAnetworking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author lamah
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException {
        InetAddress newAdd = InetAddress.getByName("224.0.1.0");
        if (newAdd.isMulticastAddress()) {
            System.out.println("The address is Global multicast address");
        } else {
            System.out.println("The address is not Global multicast address");
        }

        System.out.println("---------------------");
        InetAddress newAdd2 = InetAddress.getByName("FF02::1");
        if (newAdd2.isMCLinkLocal()) {
            System.out.println("The address is  mulitcast local link address");
        } else {
            System.out.println("The address is not mulitcast local link  address");
        }

        System.out.println("---------------------");
        InetAddress newAdd3 = InetAddress.getByName("FF01::1");
        if (newAdd3.isMCNodeLocal()) {
            System.out.println("The address is  multicast node local address");
        } else {
            System.out.println("The address is not multicast node local address");
        }
        
         System.out.println("---------------------");
        InetAddress newAdd4 = InetAddress.getByName("FF08::1");
        if (newAdd4.isMCOrgLocal()) {
            System.out.println("The address is  multicast organization-wide address");
        } else {
            System.out.println("The address is not  multicast organization-wide address");
        }
           System.out.println("---------------------");
        InetAddress newAdd5 = InetAddress.getByName("FF05::1");
        if (newAdd5.isMCSiteLocal()) {
            System.out.println("The address is  multicast site-local address");
        } else {
            System.out.println("The address is not  multicast site-local address");
        }

    }

}
