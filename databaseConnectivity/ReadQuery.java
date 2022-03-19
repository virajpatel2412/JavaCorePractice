


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package databaseConnectivity;

import java.sql.*;

/**
 *
 * @author HP
 */
public class ReadQuery {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "system manager");
        
        Statement st = conn.createStatement();
        String query = "select * from viraj.student";
        
        ResultSet result = st.executeQuery(query);
        
        while (result.next()) {
//            System.out.println(String.format("Name : %-20s  Enno : %-5d Age : %-3d", result.getString("name"),result.getInt("Enno"),result.getInt("age")));
        	System.out.println(result.getInt(1));
        }
        
    }
}
