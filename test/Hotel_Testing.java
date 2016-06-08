
import Controller.DBHandlerGetter;
import Domain.Classies.Booking;
import TechnicalServices.myDate;
import UI.Desktop.mainwindow;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakis
 */
public class Hotel_Testing {
    public static void main(String[] args) {
        // TODO code application logic here
        //myDate date = null;
        String date1 = new String("11/02/2017");
        String date2 = new String("12/03/2016");
        String date3 = new String("17/03/2017");
        
        if(myDate.betweenTo(date1, date2, date3))
            System.out.println("Einai anamesa");
        else
            System.out.println("Den einai anamesa");
        
    String url = "jdbc:mysql://localhost:3306/Hotel_System";
    String user = "root";
    String pass = "tasos";
    
    Connection con=null;
    Statement st;
    ResultSet rs;
    
        try {
            con = DriverManager.getConnection(url, user, pass);
            
            st = con.createStatement();
            rs = st.executeQuery("Select * From Customer");
            
            while(rs.next()){
                System.out.println(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Hotel_Testing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    String string = "0/0/4 to 03/45/56";
    String sub = "to";
    string = string.replaceAll("\\s+", "");
    String[] parts = string.split(sub);
    String part1 = parts[0]; // 004
    String part2 = parts[1]; // 034556
    System.out.println(part1+part2);
    }
    
}
