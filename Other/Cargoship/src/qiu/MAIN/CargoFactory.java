package qiu.MAIN;

import java.util.ArrayList;

import qiu.CARGOSHIPS.Cargoship;
import qiu.CARGOSHIPS.Shiphandling;

public class CargoFactory {

	public static ArrayList<Cargoship> buildShips(int ships) {
		ArrayList<Cargoship> shipList = new ArrayList<>();
		
		for (int i = 0; i < ships; i++)
		{
			String HN = "SH-0" + i;
			int a = (int) (Math.random()*3);
			Cargoship c = new Cargoship(Shiphandling.sName[a], Shiphandling.sNationality[a]
				 , HN, Shiphandling.sLength[a], Shiphandling.sBeam[a],Shiphandling.sHeight[a]);
			
			
			shipList.add(c);
		}
		return shipList;
	}
	
	
	public static void sampleCargoShips(ArrayList<Cargoship> shipList) {
		
		int a = (int) (Math.random() * 100);

		Cargoship sample = shipList.get(a);
		
		
		System.out.println("Sample: Ship " +a);
		System.out.print("Load Cargo: ");
		sample.loadCargo(Shiphandling.manifest);
		sample.displayInfo();
		sample.displayLoadedCargo();
		sample.verifyCargoManifest(Shiphandling.manifest);
		
		int b = (int) (Math.random()*3);
		sample.navigate(Shiphandling.sPos[b]);
		sample.dock(Shiphandling.sDock[b]);
		System.out.println();
		System.out.print("Offload Cargo: ");
		sample.offloadCargo();
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Cargoship> clist = buildShips(100);
        sampleCargoShips(clist);
	}

}
