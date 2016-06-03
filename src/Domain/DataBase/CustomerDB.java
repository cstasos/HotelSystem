/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DataBase;

import Domain.Classies.Customer;
import Domain.Classies.Customer;

/**
 *
 * @author sakis
 */
public class CustomerDB {
    
    public static Customer getCustomer(String name){
        //sql code return customer
        //String fname = null, lname = null, phone = null, AT = null;
        String fname = "Sakis", lname = "Syle", phone = "6946698143", AT = "AT-1212121";
        return new Customer(fname, lname, phone, AT);
    }
    
    public static void addCustomer(Customer c){
        //sql code to add an new customer to DB
    }
}
