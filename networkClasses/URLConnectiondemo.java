/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package networkClasses;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author HP
 */
public class URLConnectiondemo {
    public static void main(String args[]) throws MalformedURLException, IOException{
        URL url = new URL("https://www.w3schools.com/html/default.asp");
        URL ldurl = new URL("https://www.ldce.ac.in");
        URLConnection conn = url.openConnection();
//        System.out.println(conn);
        System.out.println(conn.getContentLengthLong());
        System.out.println(conn.getContentType());
        System.out.println(conn.getDate());
        System.out.println(conn.getDoInput());
        System.out.println(conn.getDoOutput());
        System.out.println(conn.getExpiration());
        System.out.println(conn.getLastModified());
        System.out.println(conn.getURL());
        
        int ch=0;
        if(conn.getContentLength()>0){
            InputStream in = conn.getInputStream();
            while((ch=in.read())!= -1){
                System.out.print((char)ch);
            }
        }
    }
}
