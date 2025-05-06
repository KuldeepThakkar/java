
    import java.io.*;
import java.net.*;

public class clientside {
    public static void main(String[] args) {
        String hostname = "localhost"; // Server hostname
        int port = 12345; // Server port number

        try (Socket socket = new Socket(hostname, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter the radius of the circle: ");
            String radius = userInput.readLine();
            out.println(radius); // Send radius to the server

            String response = in.readLine(); // Read response from the server
            System.out.println(response); // Print the area received from the server
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

