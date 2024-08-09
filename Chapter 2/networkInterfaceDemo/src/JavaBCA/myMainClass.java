/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaBCA;

import java.net.*;
import java.util.*;

/**
 *
 * @author lamah
 */
public class myMainClass {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws SocketException, UnknownHostException {

//        factoryMethods();
        getterMethods();
    }

    public static void showEnumWise() throws SocketException {
        //getNetworkInterfaces() a Factoy method retrives all the available interfaces of the current system
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            System.out.println(ni);
        }
    }

    public static void showSingle() throws UnknownHostException, SocketException {
        InetAddress local = InetAddress.getByName("127.0.0.1");
        NetworkInterface ni = NetworkInterface.getByInetAddress(local);
        System.out.println(ni);
    }

    public static void factoryMethods() throws SocketException, UnknownHostException {
        //1 getNetworkInterfaces()

        //2 getByName;
        //Rerutns a networkInterface obj associated with a specified name
        NetworkInterface ni = NetworkInterface.getByName("eth0");
        System.out.println("Interface name : " + ni.getName());

        //3 getByInetAddress(address)
        // Return a networkInterface obj assosciated with a specified ip passed in an argument
        // Requires InetAddress
        InetAddress address = InetAddress.getByName("127.0.0.1");
        NetworkInterface nia = NetworkInterface.getByInetAddress(address);
        System.out.println("Interface name : " + nia.getName());
    }

    public static void getterMethods() throws SocketException, UnknownHostException {
        //1 getName();

        //2 getInetAddresses();
        NetworkInterface ni = NetworkInterface.getByName("eth0");
        Enumeration<InetAddress> add = ni.getInetAddresses();
        while (add.hasMoreElements()) {
            System.out.println(add.nextElement().getHostAddress());
        }

    }
}
