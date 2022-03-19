/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConnectivity;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DBMetaData {

    public static void main(String atgs[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/viraj", "root", "system manager");

        DatabaseMetaData dbmd = conn.getMetaData();
        System.out.println("DataBase Product Name : " + dbmd.getDatabaseProductName());
        System.out.println("Product Version : "+dbmd.getDatabaseProductVersion());
        System.out.println("Driver Name : " + dbmd.getDriverName());
        System.out.println("Driver Version : " + dbmd.getDriverVersion());
        System.out.println("URL : " + dbmd.getURL());
        System.out.println("User Name : " + dbmd.getUserName());
    }
}
