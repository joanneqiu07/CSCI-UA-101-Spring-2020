package qiu.SUPPORT;

public enum Mineral {

	DILITHIUM(40,140), TRITANIUM(80,180), UNAMIUM(90,270);
	private double mass;
	private double strength;
	
	private Mineral(double mass, double strength) {
		this.mass = mass;
		this.strength = strength;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}
    
	
	
}
