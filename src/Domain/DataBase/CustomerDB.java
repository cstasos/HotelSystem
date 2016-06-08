/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DataBase;

import Domain.Classies.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sakis
 */
public class CustomerDB extends DataBase {        
    
    public static List<Customer> getCustomer(String name){
        List<Customer> customers = new ArrayList<Customer>();
        Connection();
        try {       
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            if(name.equals("*") || name.equals("")){
                String query = "SELECT * FROM Customer";
                
                pst = con.prepareStatement(query);
                
                rs=pst.executeQuery();
            }else{
                String query = "SELECT * FROM Customer where firstname = ? or lastname = ? or AT = ?";
                pst = con.prepareStatement(query);
                    
                pst.setString(1, name);
                pst.setString(2, name);
                pst.setString(3, name);

                rs=pst.executeQuery();
            }
            

            while (rs.next()) {
                Customer customer = new Customer(rs.getString(3), rs.getString(4), rs.getString(6), rs.getString(2),rs.getString(5));
                customer.setCID(Integer.parseInt(rs.getString(1)));
                customers.add(customer);   
            }
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return customers;
    }
    
    
    public static int addCustomer(Customer c){
        Connection();
        try {        
            String query = "insert into Customer (AT, firstname, lastname, phone, gender) values (?, ?, ?, ?, ?)";            
            PreparedStatement pst = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setString(1, c.getAT());
            pst.setString(2, c.getFname());
            pst.setString(3, c.getLname());
            pst.setString(4, c.getPhone());
            pst.setString(5, c.getGender());
            
            pst.executeUpdate();
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return getCustomerID(c.getAT());
    }
    
    
    public static Customer getCustomerById(int id){
        Customer customer = null;
        Connection();
        try {
            String query = "SELECT DISTINCT * FROM Customer where id = ?";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, id);

            rs=pst.executeQuery();

            if(rs.next()) {
                customer = new Customer(rs.getString(3), rs.getString(4), rs.getString(6), rs.getString(2),rs.getString(5));
                customer.setCID(rs.getInt(1));
            }
            
            pst.close();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return customer;
    }
    
    private static int getCustomerID(String at){
        Connection();
        int id = -1;
        try {                     
            String query = "SELECT DISTINCT * FROM Customer where AT = ?";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setString(1, at);
            
            rs=pst.executeQuery();
            
            if(rs.next())
                id = rs.getInt(1);
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return id;
    }
    
    public static void updateCustomer(Customer c){
        Connection();
        try {
            String query = "update Customer set AT = ?, firstname = ?, lastname = ?, phone = ?, gender = ? where id = ?";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setString(1, c.getAT());
            pst.setString(2, c.getFname());
            pst.setString(3, c.getLname());
            pst.setString(4, c.getPhone());
            pst.setString(5, c.getGender());
            
            pst.setInt(6, c.getCID());
            
            pst.executeUpdate();
           
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
    }
}
