/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Classies;

import TechnicalServices.myDate;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sakis
 */
public class ReservationDate {
    private myDate checkin;
    private myDate checkout;
    
    ReservationDate(String in, String out){
        this.checkin = new myDate(in);
        this.checkout = new myDate(out);
    }

    public Object getCheckinDate() {
        return checkin.getDate();
    }

    public String getCheckinName(){
        return checkin.getDateName();
    }
    
    public String getCheckoutName(){
        return checkout.getDateName();
    }
    
    public Object getCheckoutDate() {
        return checkout.getDate();
    }
    
    public int Duration(){
        long diff = this.checkout.getDate().getTime() - this.checkin.getDate().getTime();
        System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + 1;
    }
    
    @Override
    public String toString() {
        return "Dates {" + checkin + " to " + checkout+" }";
    }
    
    
}
