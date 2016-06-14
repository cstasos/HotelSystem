/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalServices;

import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author sakis
 */
public class Price {
    private int amount;
    private Currency c;

    public Price(int amount, Locale locale) {
        this.amount = amount;
        this.c = Currency.getInstance(locale);
    }
    
    public int getAmount(){
        return amount;
    }
    
    public String getCurrency(){
        return c.getSymbol();
    }
}
