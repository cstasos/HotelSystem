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

/**
 *
 * @author sakis
 */
public class DBHandlerSetter {

    public static boolean deleteResarvation(int bookid) {
       return BookingDB.deleteFromReservationByBookingId(bookid);
    }
    
    public static int addCustomer(Customer c){
        return CustomerDB.addCustomer(c);
    }
    
    public static void addBooking(Booking b){
        BookingDB.addnewBooking(b);
    }
    
    public static void updateBooking(Booking b){
        CustomerDB.updateCustomer(b.getCustomer());
        BookingDB.updateBooking(b);
    }
    
}
