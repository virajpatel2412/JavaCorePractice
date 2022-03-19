/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package networkClasses;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class IPAddress {
    public static String getHostAddress(String s){
        InetAddress ip=null;
        try {
            ip = InetAddress.getByName(s);
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
        return ip.getHostAddress();
    }
}
