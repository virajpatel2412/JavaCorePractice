/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketProgramming.TCP;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class TCPClient {

    public static void main(String args[]) throws IOException {
        Socket s = new Socket("localhost", 3000);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream out = new PrintStream(s.getOutputStream());

        BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
        String send = con.readLine();

        out.println(send);

        System.out.println("sent");

        String rcv = in.readLine();
        System.out.println("From Server : " + rcv);

        in.close();
        out.close();
        s.close();
    }
}
