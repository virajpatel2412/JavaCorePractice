/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author HP
 */

public class UpdateQuery {
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","system manager");
        
        Statement st = conn.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter En No : ");
        int enno = sc.nextInt();
        System.out.print("Enter correct Age : ");
        int age = sc.nextInt();
        
        String query = String.format("update viraj.student set age = %d where Enno = %d", age, enno);
        int n = st.executeUpdate(query);
        
        System.out.printf("%d rows updated !!",n);
    }
}
