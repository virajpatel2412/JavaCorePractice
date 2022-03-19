/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package databaseConnectivity;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class PreparedStatementDemo {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "system manager");
            
            String query = "insert into viraj.student values(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, 13);
            stmt.setString(2, "Harsh");
            stmt.setInt(3, 12);
            
            int i = stmt.executeUpdate();
            System.out.println("No. of rows Updated : "+i);
            
            stmt.close();
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            Logger.getLogger(PreparedStatementDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
