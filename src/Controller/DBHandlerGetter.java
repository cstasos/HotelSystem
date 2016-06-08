/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Domain.Classies.Booking;
import Domain.DataBase.BookingDB;
import Domain.Classies.Customer;
import Domain.DataBase.CustomerDB;
import Domain.DataBase.RoomDB;
import Domain.Classies.Room;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sakis
 */
public class DBHandlerGetter { 
    private static final SimpleDateFormat editformat = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat dbformat = new SimpleDateFormat("yyyy-MM-dd");
    
    public static List<Room> getSameTypeRoom(int type, String date1, String date2){
        List<Room> rooms;
        try {
            date1 = dbformat.format((Date)editformat.parse(date2));
            date2 = dbformat.format((Date)editformat.parse(date2));
        } catch (ParseException ex) {
            Logger.getLogger(DBHandlerGetter.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            rooms = RoomDB.getSameTypeRoom(type, date1, date2);
        }     
        return rooms;
    }
    
    public static List<Room> getAllTypeRoom(String date1, String date2){
        List<Room> rooms;
        try {
            date1 = dbformat.format((Date)editformat.parse(date2));
            date2 = dbformat.format((Date)editformat.parse(date2));
        } catch (ParseException ex) {
            Logger.getLogger(DBHandlerGetter.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            rooms = RoomDB.getAllRooms(date1, date2);
        } 
        return rooms;
    }
    
    public static List<Customer> getCustomer(String name){
        List<Customer> customers =  CustomerDB.getCustomer(name);
        return customers;
    }
    
    public static List<Booking> getBookingByAny(String s){
        String substring = new String("to");
        List<Booking> books;
        if(!s.toLowerCase().contains(substring.toLowerCase()))
            books = BookingDB.getBookingByAny(s);
        else{
            s = s.replaceAll("\\s+", "");
            String[] parts = s.split(substring);
            try {
                parts[0] = dbformat.format((Date)editformat.parse(parts[0]));
                parts[1] = dbformat.format((Date)editformat.parse(parts[1]));
            } catch (ParseException ex) {
                Logger.getLogger(DBHandlerGetter.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                books = BookingDB.getBetweentDates(parts[0], parts[1]);
            }
        }
        return books;
    }
    
    public static boolean CheckmodifyDate(int bookid, List<Room> rooms, String date1, String date2){
        
        try {
            date1 = dbformat.format((Date)editformat.parse(date2));
            date2 = dbformat.format((Date)editformat.parse(date2));
        } catch (ParseException ex) {
            Logger.getLogger(DBHandlerGetter.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            List<Room> available = RoomDB.getAllRooms(bookid, date1, date2);
            for(Room r: rooms){
               if(!available.contains(r))
                return false;
            }
        }
        
        return true; 
    }

}
