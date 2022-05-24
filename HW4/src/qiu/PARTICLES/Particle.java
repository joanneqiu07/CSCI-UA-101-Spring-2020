package qiu.PARTICLES;

import qiu.SUPPORT.Mineral;

public abstract class Particle implements Scatterable{
	
	private String retrievalCode;
	private double pDiameter;
	private double pVolume;
	private double pSurfaceArea;
	private Mineral pComposition;
	private boolean isRefined;
	
	public Particle(String retrievalCode, double pDiameter, double pVolume, double pSurfaceArea, Mineral pComposition) {
		this.retrievalCode = retrievalCode;
		this.pDiameter = pDiameter;
		this.pVolume = pVolume;
		this.pSurfaceArea = pSurfaceArea;
		this.pComposition = pComposition;
	}

	public String getRetrievalCode() {
		return retrievalCode;
	}

	public void setRetrievalCode(String retrievalCode) {
		this.retrievalCode = retrievalCode;
	}

	public double getpDiameter() {
		return pDiameter;
	}

	public void setpDiameter(double pDiameter) {
		this.pDiameter = pDiameter;
	}

	public double getpVolume() {
		return pVolume;
	}

	public void setpVolume(double pVolume) {
		this.pVolume = pVolume;
	}

	public double getpSurfaceArea() {
		return pSurfaceArea;
	}

	public void setpSurfaceArea(double pSurfaceArea) {
		this.pSurfaceArea = pSurfaceArea;
	}

	public Mineral getpComposition() {
		return pComposition;
	}

	public void setpComposition(Mineral pComposition) {
		this.pComposition = pComposition;
	}

	public boolean isRefined() {
		return isRefined;
	}

	public void setRefined(boolean isRefined) {
		this.isRefined = isRefined;
	}
	
	public void displayParticleInfo() {
		double x = pComposition.getMass();
		double y = pComposition.getStrength();
		double a = scatterLight();
		System.out.printf("%-23s %-17s   %.1f\n", pComposition+" Particle: "+retrievalCode, "Scatter Light Factor: ", a);
		System.out.println("INFO: ");
		System.out.printf("%-7s %-15s %-7.1f %-23s %-7.1f\n", " ", "Diameter:", pDiameter, "Volume:", pVolume);
		System.out.printf("%-7s %-15s %-6.1f %-24s %-7b\n", " ", "Surface Area:", pSurfaceArea, " Refined", isRefined);
		System.out.printf("%-7s %-15s %-6.1f %-24s %-7b\n", " ", "Surface Area:", pSurfaceArea, " Refined", isRefined);
		System.out.printf("%-7s %-15s %-7.1f %-23s %-7.1f\n", " ", "Mineral Mass:", x, "Mineral Strength:", y);
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public abstract double scatterLight();
	

}
