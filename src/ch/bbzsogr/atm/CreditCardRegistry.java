/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbzsogr.atm;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Boss
 */
public class CreditCardRegistry
{
    private static final Logger logger = new Logger( CreditCardRegistry.class );
    
    // <IBAN, CreditCard>
    private Map<String, CreditCard> creditcards = new HashMap<>();

    public static final CreditCardRegistry INSTANCE = new CreditCardRegistry();

    private CreditCardRegistry ()
    {
    }

    public static CreditCardRegistry getInstance ()
    {
        return INSTANCE;
    }

    public void register ( CreditCard creditcard )
    {
        creditcards.put( creditcard.getIBAN(), creditcard );
    }

    public void get ( String iban )
    {
        try
        {
            creditcards.get( iban );
        }
        catch ( NullPointerException e )
        {
            logger.log( "Error occured while trying to get credit card.", e );
        }
    }

    public List<CreditCard> get ()
    {
        return new ArrayList<>( creditcards.values() );
    }

}
