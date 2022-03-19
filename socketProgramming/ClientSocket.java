/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package socketProgramming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class ClientSocket {
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost", 888);
            InputStream in = s.getInputStream();
            
//            *****   Read using BufferedReader from socket   *****
//            BufferedReader br = new BufferedReader(new InputStreamReader(in));
//            String receivedMessage = br.readLine();
//            System.out.println("Message is : " + receivedMessage);
//            br.close();
//            s.close();
            
            
            
//            ***  Read using DataInputStream  from socket   ****
            DataInputStream di = new DataInputStream(in);
            int c = 0;
            while((c = di.read())!= -1){
                System.out.print((char)c);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
