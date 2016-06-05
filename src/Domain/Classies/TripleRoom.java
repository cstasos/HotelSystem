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
public class TripleRoom extends Room {

    public TripleRoom() { super(); }

    public TripleRoom(int id, String tp, int p) {
        super(id, tp, p);
    }
    
    @Override
    public String Benefits() {
        return "Three persons, Aircondition, TV, MiniBar";
    }

    @Override
    public int getType() {
        return tripleroom;
    }

}
