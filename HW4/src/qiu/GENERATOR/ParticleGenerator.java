package qiu.GENERATOR;

import qiu.SUPPORT.Location;


public abstract class ParticleGenerator implements Generatable{
	
	private String pGeneratorID;
	private Location pGeneratorPos;
	
	public ParticleGenerator(String pGeneratorID, Location pGeneratorPos) {
		this.pGeneratorID = pGeneratorID;
		this.pGeneratorPos = pGeneratorPos;
	}

	public String getpGeneratorID() {
		return pGeneratorID;
	}

	public void setpGeneratorID(String pGeneratorID) {
		this.pGeneratorID = pGeneratorID;
	}

	public Location getpGeneratorPos() {
		return pGeneratorPos;
	}

	public void setpGeneratorPos(Location pGeneratorPos) {
		this.pGeneratorPos = pGeneratorPos;
	}
	
	

}
