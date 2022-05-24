package qiu.REFINERY;

import qiu.SUPPORT.Location;

import qiu.PARTICLES.*;

import java.util.ArrayList;

public class ParticleRefiner implements Refinable{
	
	private String refinerID;
	private String refinerName;
	private Location refinerPos;
	private ArrayList<Particle> pStorage = new ArrayList<>();
	private ArrayList<A_Particle> Refined_AStorage = new ArrayList<>();
	private ArrayList<B_Particle> Refined_BStorage = new ArrayList<>();
	private ArrayList<C_Particle> Refined_CStorage = new ArrayList<>();

	
	public ParticleRefiner(String refinerID, String refinerName, Location refinerPos) {
		super();
		this.refinerID = refinerID;
		this.refinerName = refinerName;
		this.refinerPos = refinerPos;
	}

	public String getRefinerID() {
		return refinerID;
	}

	public void setRefinerID(String refinerID) {
		this.refinerID = refinerID;
	}

	public String getRefinerName() {
		return refinerName;
	}

	public void setRefinerName(String refinerName) {
		this.refinerName = refinerName;
	}

	public Location getRefinerPos() {
		return refinerPos;
	}

	public void setRefinerPos(Location refinerPos) {
		this.refinerPos = refinerPos;
	}

	public ArrayList<Particle> getpStorage() {
		return pStorage;
	}

	public void setpStorage(ArrayList<Particle> pStorage) {
		this.pStorage = pStorage;
	}

	public ArrayList<A_Particle> getRefined_AStorage() {
		return Refined_AStorage;
	}

	public void setRefined_AStorage(ArrayList<A_Particle> refined_AStorage) {
		Refined_AStorage = refined_AStorage;
	}

	public ArrayList<B_Particle> getRefined_BStorage() {
		return Refined_BStorage;
	}

	public void setRefined_BStorage(ArrayList<B_Particle> refined_BStorage) {
		Refined_BStorage = refined_BStorage;
	}

	public ArrayList<C_Particle> getRefined_CStorage() {
		return Refined_CStorage;
	}

	public void setRefined_CStorage(ArrayList<C_Particle> refined_CStorage) {
		Refined_CStorage = refined_CStorage;
	}
	
	@Override
	public A_Particle refineAParticle(A_Particle p) {
		boolean a = true;
		p.setRefined(a);
		return p;
	}
	@Override
	public B_Particle refineBParticle(B_Particle p) {
		boolean a = true;
		p.setRefined(a);
		return p;
	}

	@Override
	public C_Particle refineCParticle(C_Particle p) {
		boolean a = true;
		p.setRefined(a);
		return p;
	}
	public boolean emptyExtractor(ParticleExtractor pe) {
		int e = pe.getEc();
		for (Particle item:pe.getExtractorPool()) {
			pStorage.add(item);
			
			if (item.getpSurfaceArea() == 7) {
				Refined_AStorage.add((A_Particle)item);
				refineAParticle((A_Particle)item);
				e--;
			}
			else if (item.getpSurfaceArea() == 18) {
				Refined_BStorage.add((B_Particle)item);
				refineBParticle((B_Particle)item);
				e--;
			}
			else if (item.getpSurfaceArea() == 24) {
				Refined_CStorage.add((C_Particle)item);
				refineCParticle((C_Particle)item);
				e--;
			}
				
		}
		if (e == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public void sampleParticles(int count) {
		for (int a = 0; a < count; a++)
		{
			pStorage.get(a).displayParticleInfo();
		}
	}
	
	public void displayInfo() {
		System.out.println("_____PARTICLE REFINER_____");
		System.out.println("Refiner ID: " + refinerID);
		System.out.println("Location [X: "+refinerPos.getX()+", Y: "+refinerPos.getY() +"]");
		System.out.println("Current Particle Storage: "+pStorage.size()+" particles");
		System.out.println("Current A Particle Storage: "+Refined_AStorage.size()+" particles");
		System.out.println("Current B Particle Storage: "+Refined_BStorage.size()+" particles");
		System.out.println("Current C Particle Storage: "+Refined_CStorage.size()+" particles");
	}

}
