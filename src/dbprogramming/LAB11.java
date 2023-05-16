
package dbprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB11 {
     public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb1";
        String username = "root";
        String password = "130846";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Server loaded");
            Connection connection= DriverManager.getConnection(URL, username, password);
            String sql = "DELETE FROM student "
                          + "WHERE studentID = '111111'" ;
             Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB09.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB09.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
}
