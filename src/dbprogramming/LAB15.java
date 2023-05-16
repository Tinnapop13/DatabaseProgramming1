
package dbprogramming;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;



public class LAB15 {
     public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "130846";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Server loaded");
            Connection connection= DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM stuednt";
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsMetaData = results.getMetaData();
            System.out.println(rsMetaData.getColumnCount());
            
            for (int i=1; i <= rsMetaData.getColumnCount(); i++){
                System.out.println(rsMetaData.getColumnName(i));
            }
            
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB09.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB09.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
}
