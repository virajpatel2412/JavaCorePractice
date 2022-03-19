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
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author HP
 */
public class UDPSender {
    public static void main(String args[]) throws SocketException, UnknownHostException, IOException{
        
//        *****  Two way Communication   *****
        
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("localhost");
        byte[] sndstr =  "This is UDP Sender".getBytes();
        DatagramPacket sendpkt = new DatagramPacket(sndstr, sndstr.length, ip, 3000);
        ds.send(sendpkt);
        System.out.println(3000 +" : sent");
        
        
        
        byte[] rcvstr = new byte[2048];
        DatagramPacket rcvpkt = new DatagramPacket(rcvstr, rcvstr.length);
        ds.receive(rcvpkt);
        String receive = new String(rcvpkt.getData());
        int port = rcvpkt.getPort();
        System.out.println(port + " : "+ receive);
        
        ds.close();
    }
}
