package HackPoste;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


public class Hacker {
	Map<String,List<String>> t = new HashMap<>();
	File file = new File("utilisateurs.txt");
	String userNames = "connexion.log";
	String[] d = new String [3];
	String tableau;
	ArrayList<String>ipUser = new ArrayList<String>();
	ArrayList<String>user = new ArrayList<String>();
	ArrayList<Date> date = new ArrayList<Date>();
	

	
	public Hacker() {
		// TODO Auto-generated constructor stub
	}
	
	public void fichierToTab() throws IOException {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy hh:mm", Locale.FRENCH);
		
		try {
			FileReader fichier = new FileReader("connexion.log");
	      Scanner sc = new Scanner(fichier);
	      while (sc.hasNextLine()) {   
	      	this.tableau = sc.nextLine();
	      	 this.d = tableau.split(";");
	      	
	      	 this.ipUser.add(d[0]);
	      	 this.user.add(d[1]);
	      	this.date.add(formatter.parse(d[2]));
	     	
	     
	      	 }
	      //System.out.println(date);
	      sc.close();
		}catch (Exception e) {
	    	System.out.println("Fichier introuvable");
		}
	}
	
	public void ecrireFichier() throws IOException {
		for (int i = 0; i < user.size(); i++) {
			this.t.put(this.user.get(i), new ArrayList<String>());
			
		}
		FileWriter fw = new FileWriter(file);
		BufferedWriter pseudo = new BufferedWriter(fw);
	    Set<Entry<String, List<String>>> setHm = t.entrySet();
	    Iterator<Entry<String, List<String>>> it = setHm.iterator();
	    while(it.hasNext()){
	       Entry<String, List<String>> e = it.next();
	       pseudo.write(e.getKey()+"\n");
	    }pseudo.close();
		
	}
	public void compareHeures() {
		
		
		for (int i = 0; i < date.size(); i++) {
			for (int j = 0; j < ipUser.size(); j++) {
				if (condition) {
					
				}
				
			}
			
		}
		
	}

	public static void main(String[] args) throws ParseException, IOException {
		Hacker hack = new Hacker();
		hack.fichierToTab();
		hack.ecrireFichier();
		for (int i = 0; i < hack.date.size(); i++) {
			System.out.println(hack.date.get(i));
		}
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy hh:mm");
		//Date date = new Date();
		//Date date = formatter.parse(hack.d[2]);
		//String formattedDateString = formatter.format(date);
//for (int i = 0; i < hack.d[2].length(); i++) {

	//date = formatter.parse(hack.d[i]);
	//String formattedDateString = formatter.format(date);
	//System.out.print(date);
	
//}
//		String dateInString =  hack.d[2];
//		Date date = formatter.parse(dateInString);
//		System.out.println(date);
//		
//		String s = "2011/07/08 03:48:45";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mi:ss");
//		Date d = sdf.parse(s);
//		System.out.println(d);
	}

}
