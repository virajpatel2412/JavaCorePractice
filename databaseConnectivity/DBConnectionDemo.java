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
public class DBConnectionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
//            Load and register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

//            Establish the connection to the database server
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "pwd");

//            create Statement 
            Statement stmt = con.createStatement();
            
//            Execute the Statement
//            stmt.executeUpdate("insert into `viraj`.`student` values (4, 'viraj', 2)");
            ResultSet rs = stmt.executeQuery("select * from `viraj`.`student`");

            
//            Retrive the results
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "      " + rs.getInt(3));
            }

            rs.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundError : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception" + e.getMessage());
        }
    }
}
