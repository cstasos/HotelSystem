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
        Room r1 = new Room("1001","Diklino", 45);
        Room r2 = new Room("1007","Diklino", 48);
        Room r3 = new Room("1002","Diklino", 32);
        Room r4 = new Room("1003","Diklino", 48);
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
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
