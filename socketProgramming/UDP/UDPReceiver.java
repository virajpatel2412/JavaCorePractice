/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package socketProgramming.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;

/**
 *
 * @author HP
 */
public class UDPReceiver {
    public static void main(String args[]) throws SocketException, IOException{
        
//        ******   Two way Communication ******
        
        DatagramSocket ds = new DatagramSocket(3000);
        
        byte[] rcv = new byte[2048];
        DatagramPacket rcvpkt = new DatagramPacket(rcv, rcv.length);
        ds.receive(rcvpkt);
        rcv = rcvpkt.getData();
        InetAddress senderip = rcvpkt.getAddress();
        String rcvstr = new String(rcv);
        int soc = rcvpkt.getPort();
        System.out.println(soc +" : "+rcvstr);
       
        byte[] send = "Ok".getBytes();
        DatagramPacket sndpkt = new DatagramPacket(send, send.length, senderip, soc);
        ds.send(sndpkt); 
        ds.close();
    }
}
