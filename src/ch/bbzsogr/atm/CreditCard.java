/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbzsogr.atm;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.Date;

/**
 *
 * @author Boss
 */
public class CreditCard
{

    private String firstname;
    private String secondname;
    private String accountdesignation;
    private final String iban;
    private String bankdesignation;
    private int cardnumber;
    private YearMonth expiredate;
    private int pincode;
    

    public CreditCard ( String firstname, String secondname, String accountdesignation,
            String iban, String bankdesignation, int cardnumber, YearMonth expiredate, int pincode )
    {
        this.firstname = firstname;
        this.secondname = secondname;
        this.accountdesignation = accountdesignation;
        this.iban = iban;
        this.bankdesignation = bankdesignation;
        this.cardnumber = cardnumber;
        this.expiredate = expiredate;
        this.pincode = pincode;
    }
    
    public String getFirstname ()
    {
        return firstname;
    }
    
    public String getSecondname ()
    {
        return secondname;
    }
    
    public String getAccountDesignation ()
    {
        return accountdesignation;
    }
    
    public String getIBAN ()
    {
        return iban;
    }
    
    public String getBankDesignation ()
    {
        return bankdesignation;
    }
    
    public int getCardNumber ()
    {
        return cardnumber;
    }
    
    public YearMonth getExpireDate ()
    {
        return expiredate;
    }
    
    public int getPINCode ()
    {
        return pincode;
    }
}
