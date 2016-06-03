/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Classies;

import TechnicalServices.Money;

/**
 *
 * @author sakis
 */
public class Room {
    private String roomID;
    private String type;
    //private Money price;
    private int price;
    
    public Room(String l, String t, int p){
        this.roomID = l;
        this.type = t;
        this.price = p;
        //price = new Money(mt,p);
    }
    
    public String toString(){
        return (this.roomID + " " +this.type + " " + this.price);
    }
}
