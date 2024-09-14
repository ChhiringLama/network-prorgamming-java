/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javaBCA.MyClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 *
 * @author lamah
 */
public class HTTPandKeepAlive {

    public static void main(String[] args) {
    try {
            // Create a URL object pointing to the target resource
            URL url = new URL("https://example.com/api/data");

            // Open a connection to the URL
            // Type conversion happened here with (HttpURLConnection)
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET (or POST if needed)
            connection.setRequestMethod("GET");

            // Enable Keep-Alive (not mandatory, as it’s enabled by default in Java)
            connection.setRequestProperty("Connection", "keep-alive");

            // Optional: Set Keep-Alive parameters (like timeout or max)
            // Note: Keep-Alive parameters are server-dependent
            connection.setRequestProperty("Keep-Alive", "timeout=10, max=100");

            // Get the response code (triggers the actual connection)
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) { // 200 OK
                // Read and print the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine).append("\n");
                }

                // Close the input stream
                in.close();

                // Print the response content
                System.out.println(content.toString());
            } else {
                System.out.println("Request failed. Response Code: " + responseCode);
            }

            // Close the connection (the connection can be reused for subsequent requests)
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
