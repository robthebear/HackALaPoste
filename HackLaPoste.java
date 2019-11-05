import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class HackLaPoste {
    String path;
    boolean append_to_file = false;
/* 
    public HackLaPoste() {
       this.path = file_path;
} */
/* 
public HackLaPoste(String file_path, boolean append_value){
    this.path = file_path;
    this.append_to_file = append_value;
}
 */
//public void userName(String ) {
    


public void lectureFichiers() {
    ArrayList<String> fichier = new ArrayList<>();
    try {
        Scanner scanner = new Scanner(new File("connexion.log"));
        while(scanner.hasNext())
        {
            String line = scanner.next();
fichier.add(line);        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    System.out.println(fichier);
}
public static void main(String[] args) {
    HackLaPoste hack = new HackLaPoste();
    hack.lectureFichiers();
}


}