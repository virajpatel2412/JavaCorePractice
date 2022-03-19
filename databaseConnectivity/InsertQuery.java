/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConnectivity;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class InsertQuery {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "system manager");

        Statement stmt = conn.createStatement();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("Enter Enno : ");
        int enno = sc.nextInt();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        String query = String.format("insert into viraj.student values (%d, '%s', %d)", enno, name, age);
        int n = stmt.executeUpdate(query);
        
        System.out.println(String.format("%d rows updated", n));
        
    }
}
