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
    private int cID = -1;
    private String fname;
    private String lname;
    private String gender;
    private String phone;
    private String AT;
    
    public Customer(String fname, String lname, String gender, String AT, String phone) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.phone = phone;
        this.AT = AT;
    }
    
    public Customer(int id,String fname, String lname, String gender, String AT, String phone) {
        this.cID = id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.phone = phone;
        this.AT = AT;
    }

    public Customer(Customer c) {
        this.cID = c.cID;
        this.fname = c.fname;
        this.lname = c.lname;
        this.gender = c.gender;
        this.phone = c.phone;
        this.AT = c.AT;
    }
    
    public int getCID(){
        return this.cID;
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
    
    public String getGender() {
        return this.gender;
    }
    
    public void setCID(int cid){
        this.cID = cid;
    }
    
    public void setGender(String gen){
        this.gender = gen;
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
    
    public String toolString(){
        return "Name: "+lname +" "+fname +" Gender: "+gender +" IDnumber: "+ AT +" Telephone: "+phone;
    }

    public String CustomerName(){
        if(this.gender.equals("Male"))
            return "Sir "+lname +" "+fname;
        else if(this.gender.equals("Female"))
            return "Miss "+lname +" "+fname;
        else
            return "Name: "+lname +" "+fname;
    }
    
    @Override
    public String toString() {
        return "#"+ cID +" "+ "Name: "+lname +" "+fname +" IDnumber: "+ AT;
    }
 
}
