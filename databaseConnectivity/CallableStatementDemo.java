
package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author HP
 */
public class CallableStatementDemo {
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/viraj","root","system manager");
        
        CallableStatement cs = conn.prepareCall("{call getStudentName(?,?)}");
        cs.setInt(1, 13);
        cs.execute();
        System.out.println("Student Name : "+cs.getString(2));
        cs.close();
        conn.close();
    }
}
