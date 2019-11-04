import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HackLaPoste {

    public HackLaPoste() {
       
}

public void lectureFichiers(String Users) {
    try {
        Scanner scanner = new Scanner(new File("example.txt"));
        while(scanner.hasNext())
        {
            String line = scanner.next();
            //do stuff
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}


}