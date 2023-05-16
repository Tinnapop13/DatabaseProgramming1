/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprogramming;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tinnapop
 */
public class LAB08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb1";
        String username = "root";
        String password = "130846";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Server loaded");
            Connection connection = DriverManager.getConnection(URL, username, password);
            System.out.println("Driver Connected");
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM student";
            ResultSet results = statement.executeQuery(sql);
            while (results.next()) {
                
                System.out.println(results.getString(1) + " " + results.getString(2) + " " + results.getString(3) + " " + results.getString(4));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB08.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB08.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
