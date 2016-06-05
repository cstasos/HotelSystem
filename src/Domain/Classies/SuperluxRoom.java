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
public class SuperluxRoom extends Room {
    
    public SuperluxRoom() { super(); }

    public SuperluxRoom(int id, String tp, int p) {
        super(id, tp, p);
    }
    
    @Override
    public String Benefits() {
        return "Eight persons, Air-condition, Satellite TV, Work-desk, Bar, Fireplace, Hydro massage shower, Jacuzzi";
    }

    @Override
    public int getType() {
        return superluxroom;
    }
    
}
