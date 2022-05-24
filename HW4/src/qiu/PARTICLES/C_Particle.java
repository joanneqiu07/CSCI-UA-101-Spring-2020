package qiu.PARTICLES;

import qiu.SUPPORT.Mineral;

public class C_Particle extends Particle{

	private static int CParticleCount = 0;
	
	public C_Particle(String retrievalCode, double pDiameter, double pVolume, double pSurfaceArea, Mineral pComposition) {
		super(retrievalCode, 2.1, 518, 24, Mineral.UNAMIUM);
	}

	@Override
	public double scatterLight() {
		double b = getpComposition().getMass();
		double sl = b * 10;
		return sl;
	}

	public static int getCParticleCount() {
		return CParticleCount;
	}

	public static void setCParticleCount(int cParticleCount) {
		CParticleCount = cParticleCount;
	}

}
