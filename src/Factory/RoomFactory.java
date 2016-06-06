/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Domain.Classies.DoubleRoom;
import Domain.Classies.QuadRoom;
import Domain.Classies.Room;
import Domain.Classies.SingleRoom;
import Domain.Classies.SuiteRoom;
import Domain.Classies.SuperluxRoom;
import Domain.Classies.TripleRoom;

/**
 *
 * @author dienem
 */
public class RoomFactory {
    
    public static Room newRoom(int id, int type, int price){
        
        if(type == 1){
            return new SingleRoom(id, "Single", price);
        }else if(type == 2){
            return new DoubleRoom(id, "Double", price);
        }else if(type == 3){
            return new TripleRoom(id, "Triple", price);
        }else if(type == 4){
            return new QuadRoom(id, "Quad", price);
        }else if(type == 5){
            return new SuiteRoom(id, "Suite", price);
        }else if(type == 6){
            return new SuperluxRoom(id, "Super lux", price);
        }else{
            return null;
        }
    }
}
