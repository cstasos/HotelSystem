/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalServices;

/**
 *
 * @author sakis
 */
public class Money {
    private String type;
    private int price;
    
    
    public Money(String t, int p){
        this.type=t;
        this.price=p;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getType(){
        return this.type;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public String toString(){
        return (this.price+this.type);
    }
}
