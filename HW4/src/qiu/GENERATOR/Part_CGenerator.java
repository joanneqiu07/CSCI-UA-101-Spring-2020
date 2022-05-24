package qiu.GENERATOR;

import qiu.PARTICLES.B_Particle;
import qiu.PARTICLES.C_Particle;
import qiu.SUPPORT.Location;
import qiu.SUPPORT.Mineral;

public class Part_CGenerator extends ParticleGenerator{

	private static final String PTYPE = "C_Particle";
	private static final int PCAPACITY = 210;
	private static int GENERATED_COUNT = 0;
	
	public Part_CGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);
	}

	@Override
	public C_Particle generateParticle() {
		GENERATED_COUNT ++;
		C_Particle a = new C_Particle(null, 2.1, 518, 24, Mineral.UNAMIUM);
		String rc = "C" + GENERATED_COUNT;
		a.setRetrievalCode(rc);
	    return a;
	}

}
