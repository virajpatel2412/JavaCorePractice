/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketProgramming;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class ServerSocket1 {

    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(888);
            Socket s = ss.accept();
            OutputStream out = s.getOutputStream();
            PrintStream ps = new PrintStream(out);
            ps.println("Hello from server");
            ss.close();
            s.close();
            ps.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
