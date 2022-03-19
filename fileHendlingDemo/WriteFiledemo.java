/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fileHendlingDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class WriteFiledemo {

    public static void main(String args[]) throws IOException {
        File write = new File("E:\\Java\\filebyjava.txt");
        File read = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Practice\\src\\SocketProgramming\\ClientSocket.java");

        try {
            
            
            
//            *****   Write file using PrintWriter class   *****
//            PrintWriter pr = new PrintWriter(f);
//            pr.printf("My name is viraj");
//            pr.close();
            
            
            
            

//            *****    Copy file    ******
//            InputStream in = new FileInputStream(read);
//            OutputStream out = new FileOutputStream(write);
//            
//            int c=0;
//            while((c=in.read())!= -1){
//                out.write(c);
//            }
//            System.out.print(write.renameTo(new File("E:\\Java\\fileusingjava.java")));
//            in.close();
//            out.close();
            
            
            
            
  
//            ******    Take data from console   *****
            InputStream input = new DataInputStream(System.in);
            PrintWriter out = new PrintWriter(write);
            int c = 0;
            while ((c = input.read()) != -1) {
                if ((char) c == 'e') {
                    input.close();
                    break;
                } else {
                    out.append((char)c);
                }
            }
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}
