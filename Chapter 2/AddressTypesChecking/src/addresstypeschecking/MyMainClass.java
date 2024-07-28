/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addresstypeschecking;

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
        InetAddress myAdd = InetAddress.getByName("0.0.0.0");
        if (myAdd.isAnyLocalAddress()) {
            System.out.println("Is an local address");
        } else {
            System.out.println("Is not a local address");
        }
        System.out.println("------------------------");

        InetAddress localAdd = InetAddress.getByName("127.0.0.1");
        if (localAdd.isLoopbackAddress()) {
            System.out.println("Is Loopback address");
        } else {
            System.out.println("Is not a loopback address");
        }
        System.out.println("------------------------");

        System.out.println("----------Checking if an Ip is LinkLocal--------------");

        InetAddress lklocal1 = InetAddress.getByName("162.168.0.4");
        InetAddress lklocal2 = InetAddress.getByName("162.254.0.4");
        InetAddress lklocal3 = InetAddress.getByName("192.168.0.4");
        InetAddress lklocal4 = InetAddress.getByName("fe80::1");

        MyMainClass ref = new MyMainClass();

        ref.checkLnkLocal(lklocal1);
        ref.checkLnkLocal(lklocal2);
        ref.checkLnkLocal(lklocal3);
        ref.checkLnkLocal(lklocal4);
    }

    public void checkLnkLocal(InetAddress address) {
        if (address.isLinkLocalAddress()) {
            System.out.println(address + " is a Link Local address");
        } else {
            System.out.println(address + " is not a Link Local address");
        }
    }

}
