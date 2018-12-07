/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbzsogr.atm;

/**
 *
 * @author Boss
 */
public class Logger
{

    private Class clazz;
    
    // TODO: test
    public Logger ( Class clazz )
    {
        this.clazz = clazz;
    }

    public void log ( String msg )
    {
        log( msg, null );
    }
    
    public void log ( String msg, Throwable ex )
    {
        StringBuilder builder = new StringBuilder();
        builder.append( clazz );
        builder.append( ": " );
        builder.append( msg );
        builder.append( "\n" );
        builder.append( ex == null ? "" : ex );
        System.err.println( builder.toString() );
    }
}
