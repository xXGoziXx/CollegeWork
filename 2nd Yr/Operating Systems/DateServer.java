// This is the Server code, save as DateServer.java
import java.net.*;
import java.io.*;

public class DateServer {
    
   public static void main(String[] args) throws Exception {
       int clientN = 0;
      try {
         // This creates a listener socket 
         ServerSocket sock = new ServerSocket(21);
         while (true) {
            Socket client = sock.accept();
            System.out.println("Yo");
            WorkerThread worker = new WorkerThread(clientN, client);
            worker.start();
            
         }
      }
      catch (Exception ioe) {
         System.err.println(ioe);
      }
   }
   
   
}

