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
public class QuadRoom extends Room{
    
    public QuadRoom() { super(); }

    public QuadRoom(int id, String tp, int p) {
        super(id, tp, p);
    }
    
    @Override
    public String Benefits() {
        return "Four persons, Aircondition, TV, MiniBar";
    }

    @Override
    public int getType() {
        return quadroom;
    }
    
}
