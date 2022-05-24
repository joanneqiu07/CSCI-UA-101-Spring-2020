package qiu.GENERATOR;

import qiu.PARTICLES.A_Particle;
import qiu.PARTICLES.B_Particle;
import qiu.SUPPORT.Location;
import qiu.SUPPORT.Mineral;

public class Part_BGenerator extends ParticleGenerator{

	private static final String PTYPE = "B_Particle";
	private static final int PCAPACITY = 180;
	private static int GENERATED_COUNT = 0;
	
	public Part_BGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);
	}

	@Override
	public B_Particle generateParticle() {
		GENERATED_COUNT ++;
		B_Particle a = new B_Particle(null, 1.7, 396, 18, Mineral.TRITANIUM);
		String rc = "B" + GENERATED_COUNT;
		a.setRetrievalCode(rc);
	    return a;
	}

}
