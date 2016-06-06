
import Controller.DBHandlerGetter;
import Domain.Classies.Booking;
import TechnicalServices.myDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void mymain(String[] args) {
        // TODO code application logic here
        //myDate date = null;
        String date1 = new String("11/02/2017");
        String date2 = new String("12/03/2016");
        String date3 = new String("17/03/2017");
        
        if(myDate.betweenTo(date1, date2, date3))
            System.out.println("Einai anamesa");
        else
            System.out.println("Den einai anamesa");
        
        // ConfirmButton
       // Booking b = new Booking();
       // b.setBookid(DBHandlerGetter.getnewBookingID());
       // b.setRooms(DBHandlerGetter.getSameTypeRoom("diklino", "15/4/2016", "17/4/2016"));
        //b.setCustomer(DBHandlerGetter.getCustomer("Sakis"));
        System.out.println("YO"+DBHandlerGetter.getCustomer("Tasos"));
        //b.setDate("15/3/2016", "17/4/2016");
        
       // System.out.print(b);
    }
    
}
