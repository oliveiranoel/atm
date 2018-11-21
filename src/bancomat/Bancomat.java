package bancomat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;

/**
 *
 * @author noel.oliveira, dominik.suter
 * @version 1.0
 */
public class Bancomat {

    public static void main(String[] args) throws IOException {
        Bancomat bancomat = new Bancomat();
        
        bancomat.show(true);
        
    }
    
    public void listDir(JComboBox kartenDrop) throws FileNotFoundException, IOException {
        File f = new File("P:/3_Lehrjahr/M226/UML/bancomat/dateien/karten");
        File[] files = f.listFiles();
        
        if (files != null) { // Erforderliche Berechtigungen etc. sind vorhanden
            for (int i = 0; i < files.length; i++) {
                FileReader fr = new FileReader(files[i].getAbsolutePath());
                BufferedReader br = new BufferedReader(fr);

                String zeile1 = br.readLine();
                System.out.println(zeile1);
                
            }
        }
    }
    
    public void show(boolean visible) {
        if (visible) {
            Kartenschliz kartenschliz = new Kartenschliz();
            kartenschliz.setVisible(visible);
        } else {
            System.out.println("GUI Visible is false. Please set it to true");
        }
    }
    
}
