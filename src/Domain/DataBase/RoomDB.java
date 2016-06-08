/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DataBase;


import Domain.Classies.Room;
import Factory.RoomFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sakis
 */
public class RoomDB extends DataBase {
    
    public static List<Room> getSameTypeRoom(int type, String date1, String date2){
        List<Room> rooms = new ArrayList<Room>();
        Connection();
        try {                     
             String query = "select * from Room where type = ? and Room.id not in "
                     + "(select Reservation_Room.room_id from `Reservation_Room` inner join Reservation on Reservation_Room.reservation_id = Reservation.id "
                     + "where (Reservation.checkin BETWEEN ? and ?) or(Reservation.checkout BETWEEN ? and ?)) GROUP BY Room.price";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, type);
            pst.setString(2, date1);
            pst.setString(3, date2);
            pst.setString(4, date1);
            pst.setString(5, date2);
            
            rs=pst.executeQuery();
            
            while (rs.next()) {
                Room room = RoomFactory.newRoom(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                rooms.add(room);
            }
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return rooms;
    }
    
    
    public static List<Room> getRoomByResId(int resId){
        List<Room> rooms = new ArrayList();
        Connection();
        try {                     
            String query = "SELECT DISTINCT Room.id, Room.type, Room.price FROM Room INNER JOIN Reservation_Room on Room.id=Reservation_Room.room_id where Reservation_Room.reservation_id = ? ";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, resId);
            
            rs=pst.executeQuery();
            
            while (rs.next()) {
                Room room = RoomFactory.newRoom(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                rooms.add(room);                
            }
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return rooms;
    }

    public static List<Room> getAllRooms(String date1, String date2){
        List<Room> rooms = new ArrayList();
        Connection();
        try {         
            String query = "SELECT DISTINCT * from Room where Room.id not in "
                    + "(select Reservation_Room.room_id from `Reservation_Room` inner join Reservation on Reservation_Room.reservation_id = Reservation.id "
                    + "where (Reservation.checkin BETWEEN ? and ?) or(Reservation.checkout BETWEEN ? and ?)) GROUP BY Room.type,Room.price";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
            
            pst.setString(1, date1);
            pst.setString(2, date2);
            pst.setString(3, date1);
            pst.setString(4, date2);
            
            rs=pst.executeQuery();
            
            while (rs.next()) {
                Room room = RoomFactory.newRoom(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                rooms.add(room);
            }
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return rooms;
    }
    
    public static List<Room> getAllRooms(int Rid, String date1, String date2){
        List<Room> rooms = new ArrayList();
        Connection();
        try {         
            String query = "SELECT DISTINCT * from Room where Room.id not in "
                    + "(select Reservation_Room.room_id from `Reservation_Room` inner join Reservation on Reservation_Room.reservation_id = Reservation.id "
                    + "where Reservation.id != ? and ((Reservation.checkin BETWEEN ? and ?) or(Reservation.checkout BETWEEN ? and ?))) GROUP BY Room.type,Room.price";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
            
            pst.setInt(1, Rid);
            pst.setString(2, date1);
            pst.setString(3, date2);
            pst.setString(4, date1);
            pst.setString(5, date2);
            
            rs=pst.executeQuery();
            
            while (rs.next()) {
                Room room = RoomFactory.newRoom(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                rooms.add(room);
            }
            
            pst.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        CloseConnection();
        return rooms;
    }
}
