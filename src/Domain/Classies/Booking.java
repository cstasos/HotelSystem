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
    private String bookid;
    private List<Room> rooms;
    private Customer customer;
    private ReservationDate date;

    public String getBookid() {
        return bookid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ReservationDate getDate() {
        return date;
    }

    public void setBookid(String bookid) {
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

    @Override
    public String toString() {
        return "Booking{" + "bookid=" + bookid + ", rooms=" + rooms + ", customer=" + customer + ", date=" + date.toString() + '}';
    }

}
