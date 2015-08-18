/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.section.pkg1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmhasan
 */
public class Server {
    private int portNumber;

    public Server(int portNumber) {
        this.portNumber = portNumber;
        
        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Waiting on clients...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected with " + clientSocket);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getPortNumber() {
        return portNumber;
    }
    
    
}
