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
public class RollbackDemo {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
//      com.mysql.jdbc.Driver   Class now depricated new Class is below
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/viraj", "root", "system manager");
        
//        ****   void setAutoCommit(boolean status)   ---->>   
//                       it is true by default means each transaction is commited by default
        conn.setAutoCommit(false);
        
        Statement stmt = conn.createStatement();

        ResultSet result = stmt.executeQuery("select * from student");
        int count = 0;
        System.out.println("Before Insert Row");
        while (result.next()) {
            count++;
            System.out.println(String.format("Name : %-20s  Enno : %-5d Age : %-3d", result.getString("name"), result.getInt("Enno"), result.getInt("age")));
        }
        System.out.println("No. of Rows : " + count);
        
//        insert new record in DB
        String query = "insert into student values(1,'Purv',6)";
        stmt.executeUpdate(query);
        System.out.println("\nOne Row Inserted\n");
        
//      Undo the last query in the DataBase  
        conn.rollback();
        
        System.out.println("After rollBack");
        result = stmt.executeQuery("select * from student");
        count=0;
        while (result.next()) {
            count++;
            System.out.println(String.format("Name : %-20s  Enno : %-5d Age : %-3d", result.getString("name"), result.getInt("Enno"), result.getInt("age")));
        }
        System.out.println("No. of Rows : " + count);
        
//        new Record Inserted
        query = "insert into student values(1,'Purv',6)";
        stmt.executeUpdate(query);
        System.out.println("\nOne Row Inserted\n");
        
        System.out.println("After Commit");
        result = stmt.executeQuery("select * from student");
        count=0;
        while (result.next()) {
            count++;
            System.out.println(String.format("Name : %-20s  Enno : %-5d Age : %-3d", result.getString("name"), result.getInt("Enno"), result.getInt("age")));
        }
        conn.commit();
        System.out.println("No. of Rows : " + count);

        conn.close();
    }
}
