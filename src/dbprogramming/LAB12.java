
package dbprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB12 {
     public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb1";
        String username = "root";
        String password = "130846";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL, username, password);
            String sql = "INSERT INTO student(studentID,firstname,lastname,email,deptID) " + "VALUES(?,?,?,?,?)" ;
            PreparedStatement preparedstatement = connection.prepareStatement(sql);
            preparedstatement.setString(1,"111111");
            preparedstatement.setString(2,"aaa");
            preparedstatement.setString(3,"bbb");
            preparedstatement.setString(4,"aaa@kmutt.ac.th");
            preparedstatement.setString(5,"IT");
            preparedstatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB09.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB09.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
}
