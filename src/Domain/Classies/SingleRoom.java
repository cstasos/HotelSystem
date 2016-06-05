/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Classies;

/**
 *
 * @author sakis
 */
public class SingleRoom extends Room {

    public SingleRoom() { super(); }

    public SingleRoom(int id, String tp, int p) {
        super(id, tp, p);
    }
    
    @Override
    public String Benefits() {
        return "One person, Aircondition, TV, MiniBar";
    }

    @Override
    public int getType() {
        return singleroom;
    }
    
}
