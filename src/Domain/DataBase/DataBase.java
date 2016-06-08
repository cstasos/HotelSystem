/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sakis
 */
public class DataBase {
    protected static final String url = "jdbc:mysql://localhost:3306/Hoteldb";
    protected static final String user = "root";
    protected static final String password = "tasos";
    protected static Connection con;
    
    protected static void Connection(){
        try {
            con = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Check your DataBase connection!\nUser: `"+DataBase.user+"` Password: `"+DataBase.password+"`", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    protected static void CloseConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
