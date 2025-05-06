import java.net.*;
import java.io.*;

public class sserverside {
    public static void main(String[] args) {
        int port= 100;
        try(ServerSocket  serversoket = new ServerSocket(port)) {
           System.out.println("server side is litening to a port= "+port);
           while(true){
            Socket s=  serversoket.accept();
            System.out.println("client is connected");
            new cliententhandler(s).start();

           }
            
        } catch (IOException e) { e.printStackTrace();
        }
    }
}

class cliententhandler extends Thread
{
    private Socket s;

     public cliententhandler(Socket s){
        this.s=s;
     }

     public void run(){
        try (BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true)){
            String inline= in.readLine();
            double radious= Double.parseDouble(inline);
            double area = Math.PI*radious*radious;
            out.println("Area of the circle with radius " + radious + " is: " + area);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                s.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
     }
}
