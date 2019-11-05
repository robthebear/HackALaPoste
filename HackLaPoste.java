import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HackLaPoste {

    public HackLaPoste() {
       
}

public void lectureFichiers(String Users) {
    try {
        Scanner scanner = new Scanner(new File("connexion.log"));
        while(scanner.hasNext())
        {
            String line = scanner.next();
System.out.println(line);        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
public static void main(String[] args) {
    HackLaPoste hack = new HackLaPoste();
    hack.lectureFichiers(null);
}


}