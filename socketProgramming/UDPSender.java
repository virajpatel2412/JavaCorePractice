/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package socketProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author HP
 */
public class UDPSender {
    public static void main(String args[]) throws SocketException, IOException{
        DatagramSocket s = new DatagramSocket(3001);
        String str = "Hello from Sender";
        InetAddress ip = null;
        try {
            ip = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException ex) {
            System.out.println("No such Address found");
        }
        byte[] b = str.getBytes();
        
        DatagramPacket pkt = new DatagramPacket(b, b.length, ip, 3000);  
        s.send(pkt);
        s.close();
        
    }
}
