package qiu.COLLECTOR;

import qiu.SUPPORT.Location;

import java.util.ArrayList;

import qiu.PARTICLES.Particle;

public class ParticleCollector {
	
	private String collectorID;
	private Location collectorPOS;
	private ArrayList<Particle> collectorPool = new ArrayList<>();
	private static final int COLLECTOR_CAPACITY = 500;
	public ParticleCollector(String collectorID, Location collectorPOS) {
		this.collectorID = collectorID;
		this.collectorPOS = collectorPOS;
	}
	
	public String getCollectorID() {
		return collectorID;
	}

	public void setCollectorID(String collectorID) {
		this.collectorID = collectorID;
	}

	public Location getCollectorPOS() {
		return collectorPOS;
	}

	public void setCollectorPOS(Location collectorPOS) {
		this.collectorPOS = collectorPOS;
	}

	public ArrayList<Particle> getCollectorPool() {
		return collectorPool;
	}

	public void setCollectorPool(ArrayList<Particle> collectorPool) {
		this.collectorPool = collectorPool;
	}

	public static int getCollectorCapacity() {
		return COLLECTOR_CAPACITY;
	}
	
	int a = 0;
	
	public boolean collectorParticle(Particle p) {
		collectorPool.add(p);
		return true;
		/*if (COLLECTOR_CAPACITY > a)
		{
			collectorPool.add(p);
			a ++;
			return true;
		}
		else {
			return false;
		}*/
	}
	

}
