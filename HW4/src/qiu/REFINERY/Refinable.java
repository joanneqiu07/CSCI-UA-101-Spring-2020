package qiu.REFINERY;

import qiu.PARTICLES.*;

public interface Refinable {
	public abstract A_Particle refineAParticle(A_Particle p);
	public abstract B_Particle refineBParticle(B_Particle p);
	public abstract C_Particle refineCParticle(C_Particle p);

}
