package qiu.SUPPORT;

public class Location {
	
	private String name;
	private int X;
	private int Y;
	public Location(String name, int x, int y) {
		super();
		this.name = name;
		X = x;
		Y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
	public double euclideanDistance(Location L) {
		double distance = 0;
	    Location a = new Location("specifiedLocation", X, X);
		double powx = Math.pow((double)(L.X-a.X), 2);
		double powy = Math.pow((double)(L.Y-a.Y), 2);
		distance = Math.sqrt(powx + powy);
		return distance;
		
	}
	

}
