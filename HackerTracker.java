import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class HackerTracker {
 
public void lireFichier() throws IOException {
    String resultat = "utilisateurs.txt";
    String userNames = "connexion.log";
    Scanner sc = new Scanner(userNames);
    //for (int i = 0; i < userNames.length(); i++) {
        while (sc.hasNextLine()) {
            
            String [] connex = userNames.split(";");  
            for (String string : connex) {  
             String user = connex[1];
            // System.out.println(user);
             Files.write(Paths.get(connex[]),user);
         }
        }
    }
        
     
    
    public static void main(String[] args) throws IOException {
        HackerTracker hack = new HackerTracker();
        
        hack.lireFichier();
    }
    
}

