/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipoflocalmachine;

import java.net.*;
import java.util.Arrays;

/**
 *
 * @author lamah
 */
public class IPofLocalMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress me = InetAddress.getLocalHost();
            String dottedQuad = me.getHostAddress();
            System.out.println("My address is" + dottedQuad);
            } catch (UnknownHostException ex) {
            System.out.println("I'm sorry I don't know my own address");
        }
    }
}
