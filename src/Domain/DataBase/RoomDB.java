/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DataBase;


import Domain.Classies.Room;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sakis
 */
public class RoomDB {
    
    public static List<Room> getSameTypeRoom(String type, String date1, String date2){
        System.out.print("MPIKA");
        List<Room> rooms = new ArrayList();
        //SQL CODE return Rooms
        System.out.println("TASOS! "+rooms);
        return rooms;
    }
    
    public static List<Room> getAllTypeRoom(String type, String date1, String date2){
        //this.rooms = new ArrayList();
        //SQL CODE return Rooms
        //return rooms;
        return null;
    }
}
