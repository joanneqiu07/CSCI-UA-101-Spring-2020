package qiu.PARTICLES;

import qiu.SUPPORT.Mineral;

public class A_Particle extends Particle{

	private static int AParticleCount = 0;
	
	public A_Particle(String retrievalCode, double pDiameter, double pVolume, double pSurfaceArea, Mineral pComposition) {
		super(retrievalCode, 1.3, 124, 7, Mineral.DILITHIUM);
	}

	@Override
	public double scatterLight() {
		double a = getpComposition().getStrength();
		double b = getpComposition().getMass();
		double sl = a * Math.sqrt(10) * 0.28 * b;
		return sl;
	}

	public static int getAParticleCount() {
		return AParticleCount;
	}

	public static void setAParticleCount(int aParticleCount) {
		AParticleCount = aParticleCount;
	}

}
