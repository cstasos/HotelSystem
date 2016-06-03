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
public class Customer {
    private String fname;
    private String lname;
    private String phone;
    private String AT;

    public Customer(String fname, String lname, String phone, String AT) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.AT = AT;
    }

    public Customer(Customer c) {
        this.fname = c.fname;
        this.lname = c.lname;
        this.phone = c.phone;
        this.AT = c.AT;
    }
    

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAT() {
        return AT;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String Lname) {
        this.lname = Lname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAT(String AT) {
        this.AT = AT;
    }

    @Override
    public String toString() {
        return "Customer{" + "fname=" + fname + ", Lname=" + lname + ", phone=" + phone + ", AT=" + AT + '}';
    }
    
    
    
}
