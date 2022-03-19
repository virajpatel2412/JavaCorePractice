/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package networkClasses;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Urldemo {
    public static void main(String args[]){
        try {
            URL obj = new URL("https://ldce.ac.in/upload/pdf/news/2021/chemical-and-instrumentation-control-engineering-department-accredited-by-nba-v6sqQI.jpg");
            System.out.println(obj.getDefaultPort());
            System.out.println(obj.getFile());
            System.out.println(obj.getHost());
            System.out.println(obj.getPath());
            System.out.println(obj.getPort());
            System.out.println(obj.getProtocol());
            System.out.println(obj.getQuery());
            System.out.println(obj.getRef());
            System.out.println(obj.getUserInfo());
            System.out.println(obj.getAuthority());
            System.out.println(obj.toString());


        } catch (MalformedURLException ex) {
            System.out.println(ex);
        }
    }
}
