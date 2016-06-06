/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DataBase;

import Domain.Classies.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sakis
 */
public class CustomerDB {        
    
    public static List<Customer> getCustomer(String name){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/Hoteldb";
        try {
            con = DriverManager.getConnection(url, "root", "tasos");
                     
            String query = "SELECT * FROM Customer where firstname = ? or lastname = ?";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setString(1, name);
            pst.setString(2, name);
            
            rs=pst.executeQuery();
            
            List<Customer> list = new ArrayList<Customer>();
            
            while (rs.next()) {
                
                Customer customer = new Customer(rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(2));
                
                list.add(customer);
                
            }
            
            pst.close();
            return list;
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
        return null;
    }
    
    
    public static void addCustomer(Customer c){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/Hoteldb";
        try {
            con = DriverManager.getConnection(url, "root", "");
                     
            String query = "insert into Customer (AT, firstname, lastname, phone) values ( ?, ?, ?, ?)";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setString(1, c.getAT());
            pst.setString(2, c.getFname());
            pst.setString(3, c.getLname());
            pst.setString(4, c.getPhone());
            
            pst.executeUpdate();
            
            
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    
    public static Customer getCustomerById(int id){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/Hoteldb";
        try {
            con = DriverManager.getConnection(url, "root", "");
                     
            String query = "SELECT * FROM Customer where id = ?";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, id);

            
            rs=pst.executeQuery();
            
            
            while (rs.next()) {
                
                Customer customer = new Customer(rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(2));
                pst.close();
                return customer;
                
            }
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
        return null;
    }
}
