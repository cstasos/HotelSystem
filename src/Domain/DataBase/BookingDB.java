
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DataBase;

import Domain.Classies.Booking;
import Domain.Classies.Customer;
import Domain.Classies.Room;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sakis
 */
public class BookingDB extends DataBase {
    private static SimpleDateFormat sqlformat = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void addnewBooking(Booking b){
        
        List<Room> rooms = b.getRooms();
        int id = addToReservationTable(b);
        
        b.setBookid(id);
        
        for(Room r:rooms){
            addToBooking_Room(id, r.getID());
        }
        
    }
    
    public static int addToReservationTable(Booking b){
        Customer customer = (Customer)b.getCustomer();       
        Date javaCheckin = (Date)b.getCheckinDate();
        Date javaCheckout = (Date)b.getCheckoutDate();
        int id = -1;
        Connection();
        try {
            String query = "insert into Reservation (checkin, checkout, customer_id) values ( ?, ?, ?)";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                    
            
            pst.setDate(1, new java.sql.Date(javaCheckin.getTime()));
            pst.setDate(2, new java.sql.Date(javaCheckout.getTime()));
            pst.setInt(3, customer.getCID());
            
            pst.executeUpdate();
            
            try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    System.out.println(generatedKeys.toString());
                    id = generatedKeys.getInt(1);
                } 
            }
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return id;
    }
    
    public static void addToBooking_Room(int bookingId, int roomId){
        Connection();
        try {
            String query = "insert into Reservation_Room  values ( ?, ?)";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, bookingId);
            pst.setInt(2, roomId);

            pst.executeUpdate();
    
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
    }
    
    public static List<Booking> getBookingByAny(String s){
        List<Booking> bookings = new ArrayList<Booking>();
        Connection();
        try{
            int value = Integer.parseInt(s);

            try {
                String query = "SELECT DISTINCT * FROM room_reservation_customer where type = ? or id = ? or reservation_id = ? or customer_id = ?";            
                PreparedStatement pst = null;
                ResultSet rs = null;

                pst = con.prepareStatement(query);

                pst.setInt(1, value);
                pst.setInt(2, value);
                pst.setInt(3, value);
                pst.setInt(4, value);

                rs=pst.executeQuery();

                while (rs.next()) {
                    Booking b = new Booking();
                    b.setBookid(rs.getInt(4));
                    String chin = sqlformat.format(rs.getDate(5));
                    String chout = sqlformat.format(rs.getDate(6));
                    b.setDate(chin, chout);

                    Customer c = CustomerDB.getCustomerById(rs.getInt(7));
                    b.setCustomer(c);

                    List<Room> rooms = RoomDB.getRoomByResId(rs.getInt(4));                   
                    b.setRooms(rooms);

                    if(!bookings.contains(b))
                        bookings.add(b);                
                }

                pst.close();
                
            } catch (SQLException ex) {
                System.err.println(ex.toString());
            }
        }catch(Exception e){
            String value = s;
            
            try {
                PreparedStatement pst = null;
                ResultSet rs = null;
                if(value.equals("*")||value.equals("")){
                    String query = "SELECT DISTINCT * FROM room_reservation_customer";

                    pst = con.prepareStatement(query);

                    rs=pst.executeQuery();
                }else{
                    String query = "SELECT DISTINCT * FROM room_reservation_customer where AT = ? or firstname = ? or lastname = ?";

                    pst = con.prepareStatement(query);

                    pst.setString(1, value);
                    pst.setString(2, value);
                    pst.setString(3, value);

                    rs=pst.executeQuery();
                }

                while (rs.next()) {
                    Booking b = new Booking();
                    b.setBookid(rs.getInt(4));
                    String chin = sqlformat.format(rs.getDate(5));
                    String chout = sqlformat.format(rs.getDate(6));
                    b.setDate(chin, chout);

                    Customer c = CustomerDB.getCustomerById(rs.getInt(7));

                    b.setCustomer(c);

                    List<Room> rooms = RoomDB.getRoomByResId(rs.getInt(4));                   
                    b.setRooms(rooms);

                    if(!bookings.contains(b))
                        bookings.add(b);
                }

                pst.close();
                return bookings;

            } catch (SQLException ex) {
                System.err.println(ex.toString());
            }
        }
        CloseConnection();
        return bookings;
    }
    
    
    public static List<Booking>  getBetweentDates(String date1, String date2){
        List<Booking> bookings = new ArrayList<Booking>();
        Connection();
        try {
            String query = "SELECT DISTINCT * FROM `Reservation` where (checkin between ? and ?) " +
                            "or (checkout between ? and ?)";            
            PreparedStatement pst = null;
            ResultSet rs = null;

            pst = con.prepareStatement(query);

            pst.setString(1, date1);
            pst.setString(2, date2);
            pst.setString(3, date1);
            pst.setString(4, date2);
            

            rs=pst.executeQuery();

            while (rs.next()) {
                Booking b = new Booking();
                b.setBookid(rs.getInt(1));
                String chin = sqlformat.format(rs.getDate(2));
                String chout = sqlformat.format(rs.getDate(3));
                b.setDate(chin,chout);

                Customer c = CustomerDB.getCustomerById(rs.getInt(4));
                b.setCustomer(c);
                
                List<Room> rooms = RoomDB.getRoomByResId(rs.getInt(1));                   
                b.setRooms(rooms);
                
                if(!bookings.contains(b))
                    bookings.add(b);
            }

            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return bookings;
    }
    
    public static void updateBooking(Booking b){
        updateDates(b);
        deleteFromPivotByBookingId(b.getBookid());
        for (Room r: b.getRooms()){
            addToBooking_Room(b.getBookid(), r.getID());
        }
    }
    
    public static void updateDates(Booking b){
        Date javaCheckin = (Date)b.getCheckinDate();
        Date javaCheckout = (Date)b.getCheckoutDate();
        Connection();
        try {
            String query = "update Reservation set checkin = ?, checkout = ? where id = ?";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setDate(1, new java.sql.Date(javaCheckin.getTime()));
            pst.setDate(2, new java.sql.Date(javaCheckout.getTime()));
            pst.setInt(3,b.getBookid());
            
            pst.executeUpdate();

            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
    }
    
    public static void deleteFromPivotByBookingId(int bid){
        Connection();
        try {
            String query = "delete from Reservation_Room  where reservation_id = ?";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, bid);
            pst.executeUpdate();
    
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
    }
    
    public static boolean deleteFromReservationByBookingId(int bid){
        Connection();
        try {
            String query = "delete from Reservation where id = ?";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, bid);
            pst.executeUpdate();
    
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return false;
        }
        CloseConnection();
        return true;
    }
    
    public static void checkin(int bid){
        Connection();
        try {                     
            String query = "insert into CheckedIn  values ( ?)";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, bid);
            pst.executeUpdate();
    
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
    }
    
    public static void checkout(Booking b){
        int bid = b.getBookid();
        
        Date javaCheckin = (Date)b.getCheckinDate();
        Date javaCheckout = (Date)b.getCheckoutDate();
        
        Customer customer = (Customer) b.getCustomer();
        
        deleteFromReservationByBookingId(bid);
        deleteFromPivotByBookingId(bid);
        //insert into Reservation (checkin, checkout, customer_id) values ( ?, ?, ?)"
        Connection();
        try {
            String query = "insert into History (reservation_id, checkin, checkout, customer_id) values ( ?, ?, ?, ?)";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, bid);
            pst.setDate(2, new java.sql.Date(javaCheckin.getTime()));
            pst.setDate(3, new java.sql.Date(javaCheckout.getTime()));
            pst.setInt(4, customer.getCID());

            pst.executeUpdate();
    
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
    }
    
    public static List<Booking> getAllCheckinBooking(){
        List<Booking> bookings = new ArrayList<Booking>();
        Connection();
        try {
            String query = "SELECT * FROM Hoteldb.Reservation where Reservation.id "
                    + "in (select CheckedIn.reservation_id From CheckedIn)";            
            PreparedStatement pst = null;
            ResultSet rs = null;

            pst = con.prepareStatement(query);
            rs=pst.executeQuery();

            while (rs.next()) {
                Booking b = new Booking();
                b.setBookid(rs.getInt(1));
                String chin = sqlformat.format(rs.getDate(2));
                String chout = sqlformat.format(rs.getDate(3));
                b.setDate(chin,chout);

                Customer c = CustomerDB.getCustomerById(rs.getInt(4));
                b.setCustomer(c);
                
                List<Room> rooms = RoomDB.getRoomByResId(rs.getInt(1));                   
                b.setRooms(rooms);
                
                if(!bookings.contains(b))
                    bookings.add(b);
            }

            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return bookings;        
    }
}
