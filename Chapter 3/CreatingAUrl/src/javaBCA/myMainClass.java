/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaBCA;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author lamah
 */
public class myMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException {
        //Url creation
        
        try{
        URL ul=new URL("https://www.example.com:443/index.html?search=java#section2");
        URL ul2=new URL("https://www.example.com:443/index.html?search=java#section2");
      
        //Relative url
        URL ul3=new URL(ul2,"#section3");
        //int methods
        int port = ul.getPort();
        
        //String methods
        String fileName=ul.getFile();
        String autho=ul.getAuthority();
        String query=ul.getQuery();
        String ref=ul.getRef();
        String urlName=ul3.getProtocol();

        System.out.println(port);
        System.out.println(fileName);
        System.out.println("Authority:" + autho);
        System.out.println(query);
        System.out.println("Reference:"+ref);
        System.out.println("url3 protocol:"+urlName);
        
        
        //Boolean method
        if(ul.equals(ul2)){
            System.out.println("Both URL are same");
        }
        
        //URI methods
        
        URI newUri=ul.toURI();
        System.out.println(newUri);
        
        }catch(MalformedURLException ex){
        System.out.println("Exception occured");
        }
        
    }
    
}
