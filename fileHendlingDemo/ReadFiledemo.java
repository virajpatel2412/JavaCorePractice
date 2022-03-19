/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fileHendlingDemo;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.in;

/**
 *
 * @author HP
 */
public class ReadFiledemo {

    public static void main(String args[]) throws IOException {
        File f = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Practice\\src\\SocketProgramming\\ClientSocket.java");

//        ***   Read file using FileInputStream *****
//        if(f.exists()){
//            InputStream in = new FileInputStream(f);
//            int c =0;
//            while((c = in.read()) != -1){
//                System.out.print((char)c);
//            }
//            in.close();
//        }
        
        
        
        
        
//        *****    Read file using buffer from InputStream  *****
//        if(f.exists()){
//            InputStream in = new BufferedInputStream(new FileInputStream(f));
//            int c =0;
//            byte[] b = new byte[(int)f.length()];
//            if((c=in.read(b))!= -1)
//                for(byte d : b){
//                    System.out.print((char)d);
//            }
//            in.close();
//        }
        
        
        
        
        
//        *****  Read file using InputStream   ****
//        InputStream in = new DataInputStream(new FileInputStream(f));
//        int c=0;
//        while((c=in.read())!= -1){
//            
//            System.out.print((char)c);
//        }
        
        
        
        
        
//        ****   Read from console *****
//        InputStream in = new BufferedInputStream(System.in);
//        int c = 0;
//        while ((c = in.read()) != -1) {
//            if ((char) c == 'e') {
//                in.close();
//                break;
//            } else {
//                System.out.print((char) c);
//            }
//        }
        
        
//        *****    Reading file using character Reader    *****
        FileReader in = new FileReader(f);
        int c=0;
        while((c=in.read())!=-1){
            System.out.print((char)c);
        }
        
      
    }
}