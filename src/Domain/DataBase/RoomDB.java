/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DataBase;


import Domain.Classies.Room;
import Factory.RoomFactory;
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
public class RoomDB {
    
     public static List<Room> getSameTypeRoom(int type, String date1, String date2){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/Hoteldb";
        try {
            con = DriverManager.getConnection(url, "root", "tasos");
                     
            String query = "SELECT * FROM room_reservation where type = ? ";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, type);
            
            rs=pst.executeQuery();
            
            List<Room> list = new ArrayList<Room>();
            
            while (rs.next()) {
                
                Room room = RoomFactory.newRoom(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                
                list.add(room);
                
            }
            
            pst.close();
            return list;
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
        return null;
    }
    
    
    public static List<Room> getRoomByResId(int resId){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/Hoteldb";
        try {
            con = DriverManager.getConnection(url, "root", "");
                     
            String query = "SELECT Room.id, Room.type, Room.price FROM Room INNER JOIN Reservation_Room on Room.id=Reservation_Room.room_id where Reservation_Room.reservation_id = ? ";            
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            pst = con.prepareStatement(query);
                    
            pst.setInt(1, resId);
            
            rs=pst.executeQuery();
            
            List<Room> list = new ArrayList<Room>();
            
            while (rs.next()) {
                
                Room room = RoomFactory.newRoom(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                
                list.add(room);
                
            }
            
            pst.close();
            return list;
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
        return null;
    }

    public static List<Room> getAllTypeRoom(int type, String date1, String date2) {
        return null;
    }
}
