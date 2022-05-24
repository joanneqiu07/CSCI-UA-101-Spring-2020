package qiu.PARTICLES;

import qiu.SUPPORT.Mineral;

public class B_Particle extends Particle{

	private static int BParticleCount = 0;
	
	public B_Particle(String retrievalCode, double pDiameter, double pVolume, double pSurfaceArea, Mineral pComposition) {
		super(retrievalCode, 1.7, 396, 18, Mineral.TRITANIUM);
	}

	@Override
	public double scatterLight() {
		double a = getpComposition().getStrength();
		double sl = a * Math.sqrt(10);
		return sl;
	}

	public static int getBParticleCount() {
		return BParticleCount;
	}

	public static void setBParticleCount(int bParticleCount) {
		BParticleCount = bParticleCount;
	}
	

}
