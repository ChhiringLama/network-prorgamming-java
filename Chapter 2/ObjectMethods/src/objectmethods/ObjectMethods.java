/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectmethods;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author lamah
 */
public class ObjectMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            InetAddress fb1 = InetAddress.getByName("www.facebook.com");
            InetAddress fb2 = InetAddress.getByName("facebook.com");
            if(fb1.equals(fb2)){
                System.out.println("www.facebook.com is the same as facebook.com");

            } else {
                System.out.println("www.facebook.com is not the same as facebook.com");
            }
            
            int hashValue=fb1.hashCode();
            System.out.println("The hash value is: "+hashValue);
            
            String stringValue=fb2.toString();
            
            System.out.println("String value : "+stringValue);
        } catch (UnknownHostException ex) {
            System.out.println("Host lookup failed");
        }
        
        

    }
}
