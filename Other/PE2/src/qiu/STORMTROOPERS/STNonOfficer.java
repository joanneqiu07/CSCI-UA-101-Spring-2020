package qiu.STORMTROOPERS;

import qiu.ENUMS.*;
import qiu.MAIN.Location;

@SuppressWarnings("serial")
public class STNonOfficer extends Stormtrooper{

	private Weapon WeaponCarried;
	private Pack PackCarried;
	private Radio RadioCarried;
	
	public STNonOfficer(String sTID, String rank, String gender, int serviceYears, int height, int weight, Mobilization dutyCategory,
			STStatus dutyStatus, Location position, Weapon weaponCarried, Pack packCarried, Radio radioCarried, MOS role) {
		super(sTID, rank, gender, serviceYears, height, weight, dutyCategory, dutyStatus, position, role);
		
		this.WeaponCarried = Weapon.Blaster_Rifle;
		this.PackCarried = Pack.AssaultPack;
		this.RadioCarried = Radio.RTS_L2;
	}

	public Weapon getWeaponCarried() {
		return WeaponCarried;
	}

	public void setWeaponCarried(Weapon weaponCarried) {
		WeaponCarried = weaponCarried;
	}

	public Pack getPackCarried() {
		return PackCarried;
	}

	public void setPackCarried(Pack packCarried) {
		PackCarried = packCarried;
	}

	public Radio getRadioCarried() {
		return RadioCarried;
	}

	public void setRadioCarried(Radio radioCarried) {
		RadioCarried = radioCarried;
	}
	
	
	public void displayCarriedItems() {
		
		System.out.println("Weapon: " + this.WeaponCarried);
		System.out.println("Pack: " + this.PackCarried);
		System.out.println("Radio: " + this.RadioCarried);
	}
	
	
	

}
