/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Classies;

import TechnicalServices.myDate;

/**
 *
 * @author sakis
 */
public class ReservationDate {
    private myDate checkin;
    private myDate checkout;
    
    ReservationDate(){
        this.checkin = new myDate();
        this.checkout = new myDate();
    }
    
    ReservationDate(String in, String out){
        this.checkin = new myDate(in);
        this.checkout = new myDate(out);
    }

    @Override
    public String toString() {
        return "ReservationDate{" + "checkin=" + checkin + ", checkout=" + checkout + '}';
    }
    
    
}
