package qiu.STORMTROOPERS;

import java.io.Serializable;

import qiu.ENUMS.*;
import qiu.MAIN.Location;

@SuppressWarnings("serial")
public class Stormtrooper implements Serializable{
	
	private String STID;
	private String Rank;
	private String Gender;
	private int ServiceYears;
	private int Height;
	private int Weight;
	private Mobilization DutyCategory;
	private STStatus DutyStatus;
	private Location Position;
	private MOS Role;
	private static int TrooperCount;
	public Stormtrooper(String sTID, String rank, String gender, int serviceYears, int height, int weight, Mobilization dutyCategory,
			STStatus dutyStatus, Location position, MOS role) {
		super();
		STID = sTID;
		Rank = rank;
		Gender = gender;
		ServiceYears = serviceYears;
		Height = height;
		Weight = weight;
		DutyCategory = dutyCategory;
		DutyStatus = dutyStatus;
		Position = position;
		Role = role;
	}
	public String getSTID() {
		return STID;
	}
	public void setSTID(String sTID) {
		STID = sTID;
	}
	public String getRank() {
		return Rank;
	}
	public void setRank(String rank) {
		Rank = rank;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public Mobilization getDutyCategory() {
		return DutyCategory;
	}
	public void setDutyCategory(Mobilization dutyCategory) {
		DutyCategory = dutyCategory;
	}
	public STStatus getDutyStatus() {
		return DutyStatus;
	}
	public void setDutyStatus(STStatus dutyStatus) {
		DutyStatus = dutyStatus;
	}
	public Location getPosition() {
		return Position;
	}
	public void setPosition(Location position) {
		Position = position;
	}
	public MOS getRole() {
		return Role;
	}
	public void setRole(MOS role) {
		Role = role;
	}
	public static int getTrooperCount() {
		return TrooperCount;
	}
	public static void setTrooperCount(int trooperCount) {
		TrooperCount = trooperCount;
	}
	
	public void displayStormtrooperInfo() {
		String ds = null;
		if (this.DutyStatus == STStatus.FullDuty) {
			ds = "Full_Duty";
		}
		else if(this.DutyStatus == STStatus.Wounded) {
			ds = "Wounded";
		}
		System.out.println(this.Rank + " " + this.STID + " Stormtrooper: " + this.Role);
		System.out.println("Height: " + this.Height + "     Weight: " + this.Weight + "     Gender: " + this.Gender);
		System.out.printf("%-25s %-27s %25s\n","Duty Category: " + this.DutyCategory, "   Duty Status: " + ds
				, "   Current Location: " + this.Position.toString());
		
	}
	public int getServiceYears() {
		return ServiceYears;
	}
	public void setServiceYears(int serviceYears) {
		ServiceYears = serviceYears;
	}
	
	
	

}
