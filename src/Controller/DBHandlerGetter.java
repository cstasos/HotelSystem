/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Domain.DataBase.BookingDB;
import Domain.Classies.Customer;
import Domain.DataBase.CustomerDB;
import Domain.DataBase.RoomDB;
import Domain.Classies.Room;
import java.util.List;

/**
 *
 * @author sakis
 */
public class DBHandlerGetter {   
    
    public static List<Room> getSameTypeRoom(String type, String date1, String date2){
        List<Room> rooms;
        rooms = RoomDB.getSameTypeRoom(type, date1, date2);
        return rooms;
    }
    
    public static List<Room> getAllTypeRoom(String type, String date1, String date2){
        List<Room> rooms;
        rooms = RoomDB.getAllTypeRoom(type, date1, date2);
        return rooms;
    }
    
    public static List<Customer> getCustomer(String name){
        List<Customer> customers =  CustomerDB.getCustomer(name);
        return customers;
    }
    
    public static String getnewBookingID(){
        return BookingDB.getnewBookingID();
    }
}
