/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Classies;

import java.util.List;

/**
 *
 * @author sakis
 */
public class Booking {
    private int bookid;
    private List<Room> rooms;
    private Customer customer;
    private ReservationDate date;

    public int getBookid() {
        return bookid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Object getCheckinDate() {
        return date.getCheckinDate();
    }
    
    public Object getCheckoutDate() {
        return date.getCheckoutDate();
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDate(String date1, String date2) {
        this.date = new ReservationDate(date1,date2);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    
    public ReservationDate getReservationDate(){
        return this.date;
    } 
    
    public int getTotalCost(){
        int cost = 0;
        for(Room r : rooms)
            cost+=r.getPrice()*date.Duration();
        return cost;
    }
    
    @Override
    public boolean equals(Object obj) {
        Booking other = (Booking) obj;
        if(this.bookid == other.bookid){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "BookingID #"+bookid +"#"+ date +",#rooms " + rooms.size() + ", Customer { #" +customer.getCID()+"#" + customer.CustomerName() + "}";
    }

}
