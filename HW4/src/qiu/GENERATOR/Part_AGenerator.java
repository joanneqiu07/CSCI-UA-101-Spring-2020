package qiu.GENERATOR;

import qiu.PARTICLES.A_Particle;
import qiu.SUPPORT.Location;
import qiu.SUPPORT.Mineral;

public class Part_AGenerator extends ParticleGenerator{

	private static final String PTYPE = "A_Particle";
	private static final int PCAPACITY = 100;
	private static int GENERATED_COUNT = 0;
	
	public Part_AGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);
		
	}

	@Override
	public A_Particle generateParticle() {
		GENERATED_COUNT ++;
		A_Particle a = new A_Particle(null, 1.3, 124, 7, Mineral.DILITHIUM);
		String rc = "A" + GENERATED_COUNT;
		a.setRetrievalCode(rc);
	    return a;
	}

	
}
