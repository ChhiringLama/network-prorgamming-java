/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaBCA;


import java.net.*;

/**
 *
 * @author lamah
 */
public class MyClass {

    public static void main(String[] args) {
        try {
            // Create the proxy address separately
            InetSocketAddress proxyAddress = new InetSocketAddress("192.168.254.254", 9000);
            // Create the proxy using the address
            Proxy proxy = new Proxy(Proxy.Type.HTTP, proxyAddress);

            // Create a URL object
            URL url = new URL("http://example.com");

            // Open the connection using the proxy
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);

            // Connect and print the response code
            System.out.println("Response Code: " + connection.getResponseCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
