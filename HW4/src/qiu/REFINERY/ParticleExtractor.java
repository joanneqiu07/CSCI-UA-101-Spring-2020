package qiu.REFINERY;

import qiu.SUPPORT.Location;

import java.util.ArrayDeque;

import qiu.COLLECTOR.ParticleCollector;

import qiu.PARTICLES.Particle;

public class ParticleExtractor {
	
	private String extractorID;
	private Location extractorPOS;
	private ArrayDeque<Particle> extractorPool = new ArrayDeque<>();
	private int ec = 0;
	private static final int EXTRACTOR_CAPACITY = 500;
	public ParticleExtractor(String extractorID, Location extractorPOS) {
		this.extractorID = extractorID;
		this.extractorPOS = extractorPOS;
	}
	
	public int getEc() {
		return ec;
	}

	public void setEc(int ec) {
		this.ec = ec;
	}

	public String getExtractorID() {
		return extractorID;
	}

	public void setExtractorID(String extractorID) {
		this.extractorID = extractorID;
	}

	public Location getExtractorPOS() {
		return extractorPOS;
	}

	public void setExtractorPOS(Location extractorPOS) {
		this.extractorPOS = extractorPOS;
	}

	public ArrayDeque<Particle> getExtractorPool() {
		return extractorPool;
	}

	public void setExtractorPool(ArrayDeque<Particle> extractorPool) {
		this.extractorPool = extractorPool;
	}

	public static int getExtractorCapacity() {
		return EXTRACTOR_CAPACITY;
	}
	
	public boolean extractParticles(ParticleCollector pc) {
		pc.getCollectorPool();
		if (ec < EXTRACTOR_CAPACITY) {
			for (Particle item: pc.getCollectorPool())
			{
				extractorPool.offerLast(item);
			}
			ec++;
			return true;
		}
		else {
			System.out.println("Extractor Pool does not have sufficient capacity");
			return false;
		}
	}

}
