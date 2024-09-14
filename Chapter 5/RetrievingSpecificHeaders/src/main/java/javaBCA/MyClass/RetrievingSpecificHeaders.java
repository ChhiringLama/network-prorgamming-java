/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaBCA.MyClass;

import java.net.*;
import java.io.*;
import java.util.Date;

/**
 *
 * @author lamah
 */
public class RetrievingSpecificHeaders {
    HttpURLConnection connection;
    
    public RetrievingSpecificHeaders() throws MalformedURLException, IOException {
        URL url = new URL("https://www.w3schools.com");
        connection = (HttpURLConnection) url.openConnection();
    }

    public static void main(String[] args) throws IOException {
        RetrievingSpecificHeaders v=new RetrievingSpecificHeaders();
//        v.executeHeader();
        v.executeArbitary();
    }

    public void executeHeader() {
        System.out.println("Content-type: " + connection.getContentType());
        System.out.println("Content-econding: " + connection.getContentEncoding());
        System.out.println("Date: " + new Date(connection.getDate()));
        System.out.println("Last Modified: " + new Date(connection.getLastModified()));
        System.out.println("Expiration date: " + new Date(connection.getExpiration()));
        System.out.println("Content-length: " + connection.getContentLength());
    }

    public void executeArbitary() {
        //Arbitary Methods
        System.out.println("Content-type: " + connection.getHeaderField("content-type"));
        System.out.println("Content-encoding: " + connection.getHeaderField("content-encoding"));
        System.out.println("Date: " + new Date(connection.getHeaderField("date")));
        System.out.println("-----------------");
        System.out.println(""+ connection.getHeaderField(4));
        System.out.println(""+ connection.getHeaderField(5));
        System.out.println("-----------------");
        System.out.println(""+ connection.getHeaderFieldKey(4));
        System.out.println(""+ connection.getHeaderFieldKey(5));
        System.out.println("-----------------");
        System.out.println(""+ connection.getHeaderFieldDate("expires",0));
        System.out.println(""+ connection.getHeaderFieldDate("last-modification",0));
        System.out.println("-----------------");
        System.out.println(""+ connection.getHeaderFieldInt("content-length",0));
 
        
        
    }
}
