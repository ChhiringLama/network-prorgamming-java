/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaBCA;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;
import java.net.MalformedURLException;

/**
 *
 * @author lamah
 */
public class MyClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            
            InputStream in = url.openStream();
            in = new BufferedInputStream(in);
            
            Reader r = new InputStreamReader(in);
            
            int c;
            while ((c = r.read()) != 1) {
                System.out.print((char) c);
            }
            
        } catch (MalformedURLException e) {
            e.printStackTrace();            
        }
        
    }
    
}
