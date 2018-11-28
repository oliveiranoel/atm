package ch.bbzsogr.atm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 * @author noel.oliveira, dominik.suter
 * @version 1.0
 * @since 28.11.18
 */
public class Atm
{

    public static final String CREDITCARD_FILES_PATH = "../../../../data/creditcards/";

    public void initComobobox ( JComboBox kartenDrop )
    {
        File[] files = new File( CREDITCARD_FILES_PATH ).listFiles();

        if ( files == null )
        {
            Logger.getLogger( Atm.class.getName() ).log( Level.SEVERE, null, "File not found." );
        }
        else
        {
            for ( File file : files )
            {
                try ( InputStream inputStream = new FileInputStream( CREDITCARD_FILES_PATH ) )
                {
                    FileReader fr = new FileReader( file.getAbsolutePath() );
                    BufferedReader br = new BufferedReader( fr );

                    String zeile1 = br.readLine();
                    System.out.println( zeile1 );
                }
                catch ( IOException e )
                {
                    Logger.getLogger( Atm.class.getName() ).log( Level.SEVERE, null, e );
                }
            }
        }

    }
}
