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
public abstract class Room {
    protected static final int singleroom = 1;
    protected static final int doubleroom = 2;
    protected static final int tripleroom = 3;
    protected static final int quadroom = 4;
    protected static final int suiteroom = 5;
    protected static final int superluxroom = 6;
    
    private int ID;
    private String type;
    private int price;
    
    Room(){}
    
    Room(int id, String tp, int p){
        this.ID = id;
        this.type = tp;
        this.price = p;
    }
    
    public abstract String Benefits();
    
    public abstract int getType();
    
    public int getID(){
        return this.ID;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IDroom= "+ ID + ", type= " + type + ", price= " + price+"$";
    }
    
       
    
}
