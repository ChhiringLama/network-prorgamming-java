/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javaBCA.MyClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author lamah
 */
public class PasswordAuthenticator extends Authenticator {

    public static void main(String[] args) {
     try {
            // Set this instance as the default Authenticator
            Authenticator.setDefault(new PasswordAuthenticator());

            // URL that requires authentication
            URL url = new URL("https://example.com/protected-resource");
            // Open a connection
            URLConnection connection = url.openConnection();

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Override the getPasswordAuthentication() method
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        // Provide the username and password
        return new PasswordAuthentication("Chhiring", "Chhiring".toCharArray());
    }
}
