package ch.bbzsogr.atm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;

/**
 * @author noel.oliveira, dominik.suter
 * @version 1.0
 * @since 28.11.18
 */
public class Atm
{
    public static final String CREDITCARD_FILES_PATH = "../../../../data/creditcards/";
    
    public static void main ( String[] args ) throws IOException
    {
        Atm bancomat = new Atm();
        bancomat.show( true );

    }

    public void listDir ( JComboBox kartenDrop ) throws FileNotFoundException, IOException
    {
        File f = new File( CREDITCARD_FILES_PATH );
        File[] files = f.listFiles();

        if ( files != null )
        { // Erforderliche Berechtigungen etc. sind vorhanden
            for ( int i = 0; i < files.length; i++ )
            {
                FileReader fr = new FileReader( files[i].getAbsolutePath() );
                BufferedReader br = new BufferedReader( fr );

                String zeile1 = br.readLine();
                System.out.println( zeile1 );
            }
        }
        else
        {
            System.out.println( "Dateien können nicht gelesen werden." );
        }
    }

    public void show ( boolean visible )
    {
        if ( visible )
        {
            AtmGUI kartenschliz = new AtmGUI();
            kartenschliz.setVisible( visible );
        }
        else
        {
            System.out.println( "GUI Visible is false. Please set it to true." );
        }
    }

}
