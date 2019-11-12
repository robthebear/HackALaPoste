package HackPoste;

import java.io.BufferedWriter;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.Map.Entry;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.io.IOException;

public class HackerTracker {
	Map<String,List<String>> t = new HashMap<>();
	File file = new File("utilisateurs.txt");
	String userNames = "connexion.log";
	String[] d = new String [3];
	//HashSet set = new HashSet();
	String tableau;
	
	

	public void lireFichier() throws IOException {
   
  
    try {
      FileReader fichier = new FileReader("connexion.log");
      Scanner sc = new Scanner(fichier);
      
      
    while (sc.hasNextLine()) {   
    	this.tableau = sc.nextLine();
    	 this.d = tableau.split(";");
    	t.put(d[1], new ArrayList<String>());
    	
    	// System.out.println("Le dossier est ok");
    	 
    }	//pseudo.close();
    } catch (Exception e) {
    	System.out.println("Fichier introuvable");
    	
    }
    
}
public void ecrireFichier() throws IOException {
	FileWriter fw = new FileWriter(file);
	BufferedWriter pseudo = new BufferedWriter(fw);
    Set<Entry<String, List<String>>> setHm = this.t.entrySet();
    Iterator<Entry<String, List<String>>> it = setHm.iterator();
    while(it.hasNext()){
       Entry<String, List<String>> e = it.next();
       pseudo.write(e.getKey()+"\n");
    }pseudo.close();
	
}
//    public void lireHeure() throws ParseException, FileNotFoundException {
//    	List<String> ipUser = new ArrayList<String>();
//    	List<String> user = new ArrayList<String>();
//    	
//    	int index = 0;
//		String dateInString = d[2];
//		while (index <dateInString.length()) {
//			
//			SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy hh:mm");
//			ArrayList<Date> date = new ArrayList<Date>(index++);	
//		 date = formatter.parse(dateInString);
//		String formattedDateString = formatter.format(date);
//		System.out.println(date);
//		index++;
//		}
//    	while (sc.nextLine() != null) {
//    		
//    		ipUser.add(sc.nextLine());
//				
			
    		//user.add(d[1]);
//    		date.addAll(d[2]);
//    		SimpleDateFormat date1=new SimpleDateFormat("dd/MM/yy hh:mi"); 
//    		(Date)i = date1.parse(d[2]);
//    		System.out.println(date1);
			//System.out.println(user);
//		} 
		
    		
			
		
		
    		
	
    

	public static void main(String[] args) throws IOException, ParseException{
        HackerTracker hack = new HackerTracker();
			
        hack.lireFichier();
        for (int i = 0; i < hack.tableau.length(); i++) {
        System.out.println(hack.tableau);
        }
      // hack.ecrireFichier();
      // hack.lireHeure();
    }

}
