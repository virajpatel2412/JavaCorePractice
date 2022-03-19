/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package socketProgramming.TCP;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class TCPServer {
    public static void main(String args[]) throws IOException{
        ServerSocket s = new ServerSocket(3000);
       
        while(true){
            Socket ss = s.accept();
            OutputStream outobj = ss.getOutputStream();
            PrintStream ps = new PrintStream(outobj);
            
            InputStream inobj = ss.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inobj));
            
            String rcv = br.readLine();
            System.out.println("From Client : "+ rcv);
            
            String send = rcv.toUpperCase();
            System.out.println("Send Client : "+send);
            ps.println(send);
            ps.close();
            ss.close();
        } 
    }
}
