/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbzsogr.atm;

/**
 * @author noel.oliveira, dominik.suter
 * @version 1.0
 * @since 28.11.18
 */
public class Module
{

    private static final Module INSTANCE = new Module();

    private Module ()
    {
    }

    public static Module getInstance ()
    {
        return INSTANCE;
    }

    public static void main ( String[] args )
    {
        Module.getInstance().start();
    }

    private void start ()
    {
        show( true );
    }

    private void show ( boolean visible )
    {
        java.awt.EventQueue.invokeLater( new Runnable()
        {
            public void run ()
            {
                new CardSlot().setVisible( true );
            }
        } );
    }
}
