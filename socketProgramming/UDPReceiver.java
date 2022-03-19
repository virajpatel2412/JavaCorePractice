/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package socketProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author HP
 */
public class UDPReceiver {
    public static void main(String args[]) throws SocketException, IOException{
        
        DatagramSocket s  = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket pkt = new DatagramPacket(buf, 1024);
        s.receive(pkt);
        String rcvmsg = new String(pkt.getData(), 0, pkt.getLength());
        System.out.println(rcvmsg);
        s.close();
        
    }
}
