package qiu.CARGOSHIPS;

import qiu.HOLD.*;

public class Cargoship implements Shiphandling{
	
	private String name;
	private String nationality;
	private String hullNumber;
	private double length;
	private double beam;
	private double height;
	private double cubicDisplacement;
	private double massDisplacement;
	private CargoHold Hold_1 = new CargoHold();
	private CargoHold Hold_2 = new CargoHold();
	private static int ShipCount = 0;
	
	public Cargoship(String name, String nationality, String hullNumber, double length, double beam, double height) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.hullNumber = hullNumber;
		this.length = length;
		this.beam = beam;
		this.height = height;
		this.cubicDisplacement = length * beam * height;
		this.massDisplacement = cubicDisplacement * 64;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getHullNumber() {
		return hullNumber;
	}

	public void setHullNumber(String hullNumber) {
		this.hullNumber = hullNumber;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBeam() {
		return beam;
	}

	public void setBeam(double beam) {
		this.beam = beam;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getCubicDisplacement() {
		return cubicDisplacement;
	}

	public void setCubicDisplacement(double cubicDisplacement) {
		this.cubicDisplacement = cubicDisplacement;
	}

	public double getMassDisplacement() {
		return massDisplacement;
	}

	public void setMassDisplacement(double massDisplacement) {
		this.massDisplacement = massDisplacement;
	}

	public CargoHold getHold_1() {
		return Hold_1;
	}

	public void setHold_1(CargoHold hold_1) {
		Hold_1 = hold_1;
	}

	public CargoHold getHold_2() {
		return Hold_2;
	}

	public void setHold_2(CargoHold hold_2) {
		Hold_2 = hold_2;
	}

	public static int getShipCount() {
		return ShipCount;
	}

	public static void setShipCount(int shipCount) {
		ShipCount = shipCount;
	}
	
	public boolean loadCargo(String[] cargo) {
		Hold_1.loadHold(cargo);
		Hold_2.loadHold(cargo);
		if (Hold_1.getHold() != null && Hold_2.getHold() != null)
		{
			System.out.println("All Cargo Items Loaded");
			System.out.println();
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean verifyCargoManifest(String[] manifest) {
		String[]a = Hold_1.getHold();
		String[]b = Hold_2.getHold();
		
		for (int i = 0; i < 12; i++) {
			if (a[i] == Shiphandling.manifest[i] && b[i] == Shiphandling.manifest[i]) {
				continue;
			}
			else {
				System.out.println("Manifest Cannot be Verified");
				return false;
			}
		}
		System.out.println("Manifest Verified");
		System.out.println();
		return true;
	}
	
	public void displayLoadedCargo() {
		String[] a = Hold_1.getHold();
		String[] b = Hold_2.getHold();
		System.out.printf("%-20s %-20s\n","Hold 1 (" + a.length + " items)", "Hold 2 ("+ b.length + " items)");
		
		for (int i = 0; i < 12; i++) {
			
			System.out.printf("%-20s %-20s\n", a[i], b[i]);
		}
		System.out.println();
	}
	
	public boolean offloadCargo() {
		String[] a = Hold_1.getHold(); //remove cargo hold 1
		String[] b = Hold_2.getHold(); //remove cargo hold 2
		
		Hold_1.setHold(null);
		Hold_2.setHold(null);
		
		if (Hold_1.getHold() == null && Hold_2.getHold() == null)
		{
			System.out.println("Cargo Hold is Empty");
			return true;
		}
		else {
			return false;
		}
	}
	
	public void displayInfo() {
		System.out.printf("%-10s %-15s %-15s %-10s %-13s %-10s\n", "Name: ", name, "Nationality: ", nationality, "Hull Number: ", hullNumber);
		System.out.printf("%-10s %-15s %-15s %-10s %-13s %-10s\n", "Length: ", length, "Beam: ", beam, "Height: ", height);
		System.out.printf("%-10s %-15s %-15s %-10s\n", "Cubic: ", cubicDisplacement, "Mass: ", massDisplacement);
		System.out.println();
	}

	@Override
	public void navigate(String pos) {
		System.out.println(name+" is navigating to "+pos);
	}

	@Override
	public void dock(String d) {
		System.out.println(name+" has docked at "+d);
		
	}
	
	
}
