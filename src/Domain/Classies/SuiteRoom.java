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
public class SuiteRoom extends Room {
    
    public SuiteRoom() { super(); }

    public SuiteRoom(int id, String tp, int p) {
        super(id, tp, p);
    }
    
    @Override
    public String Benefits() {
        return "Six persons, Air-condition, Satellite TV, Work-desk, Bar, Fireplace";
    }

    @Override
    public int getType() {
        return suiteroom;
    }
    
}
