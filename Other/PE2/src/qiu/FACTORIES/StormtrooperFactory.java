package qiu.FACTORIES;


import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import qiu.STORMTROOPERS.*;
import qiu.ENUMS.*;
import qiu.MAIN.Location;


public class StormtrooperFactory{
	

	public static ArrayList<Stormtrooper> buildStormtroopers(String fn) 
			throws FileNotFoundException, IOException {
		ArrayList<Stormtrooper> bs = new ArrayList<Stormtrooper>();
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(fn)); 
	    String sentence = reader.readLine();
	    int i = 0;
	    while(sentence != null) {
	         String[] st = sentence.split("\\s");
             if (st[1].equals("LT")) {
	        		 Location lo = new Location(Integer.parseInt(st[8]),Integer.parseInt(st[9]));
	        		 STOfficer sto = new STOfficer(st[0],st[1],st[2],Integer.parseInt(st[3]),Integer.parseInt(st[4]),
	        				 Integer.parseInt(st[5]), Mobilization.valueOf(st[6]), STStatus.FullDuty, lo, Weapon.Blaster, 
	        				 Pack.PatrolPack, Radio.RTS_1, Cypher.Alpha, MOS.valueOf(st[10]));
	        		 bs.add(sto);
	        }
	         else{
	        		 Location loc = new Location(Integer.parseInt(st[8]),Integer.parseInt(st[9]));
	        		 STNonOfficer std = new STNonOfficer(st[0],st[1],st[2],Integer.parseInt(st[3]),Integer.parseInt(st[4]),
	        				 Integer.parseInt(st[5]), Mobilization.valueOf(st[6]), STStatus.Wounded, loc, Weapon.Blaster_Rifle, 
	        				 Pack.AssaultPack, Radio.RTS_L2, MOS.valueOf(st[10]));
	        		 bs.add(std);
	        }
	         i++;
	         sentence = reader.readLine();
	      }
		
		return bs;
	}
	
	public static boolean storeStormtroopers(ArrayList<Stormtrooper> st,String fn) 
			throws FileNotFoundException, IOException{
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fn));
		for(Stormtrooper sto: st) {
			output.writeObject(sto);
		}
		output.close();
		return true;
	}
	
	public static ArrayList<Stormtrooper> retrieveStormtroopers(String fn) 
			throws IOException, ClassNotFoundException{
		ArrayList<Stormtrooper> st = new ArrayList<Stormtrooper>();
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(fn));
		Stormtrooper sto = (Stormtrooper) input.readObject();
		while(sto != null) {
			try {
				st.add(sto);
				sto = (Stormtrooper) input.readObject();
			} catch (EOFException e) {
				break;
			}
		}
		input.close();
		return st;
	}
	
	public static void displayStormtroopers(ArrayList<Stormtrooper> st, int c) {
		for (int i = 0; i < c; i++) {
			st.get(i).displayStormtrooperInfo();
			System.out.println("______________________________");
		}
	}

}
