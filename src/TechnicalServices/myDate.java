/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author sakis
 */
public class myDate {
    private int year;
    private int month;
    private int day;
    private String dname;
    private Date date;
    private String slash= "[/]";
    private String dateformat = "dd/MM/yyyy";
    private SimpleDateFormat format = new SimpleDateFormat(dateformat);
    
    public myDate(String data){
        String[] token = data.split(slash);
        this.day = Integer.parseInt(token[0]);
        this.month = Integer.parseInt(token[1]);
        this.year = Integer.parseInt(token[2]);
        this.dname = new String(this.day+"/"+this.month+"/"+this.year);
        this.Converter();
    }
    
    private void Converter(){
        try {
            this.date = format.parse(dname);
        } catch (ParseException ex) {
            Logger.getLogger(myDate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public String getDateName(){
        return this.dname;
    }

    public static boolean betweenTo(String comp, String startdate, String findate){
       myDate c = new myDate(comp);
       myDate sd = new myDate(startdate);
       myDate fd = new myDate(findate);
       
       if(c.getDate().compareTo(sd.getDate()) >= 0 && c.getDate().compareTo(fd.getDate()) <=0)
           return true; // einai anamesa se yparxousa hmeromhnia
       return false;
    }

    @Override
    public String toString() {
        return "myDate{" + "dname=" + dname + '}';
    }
    
    
}