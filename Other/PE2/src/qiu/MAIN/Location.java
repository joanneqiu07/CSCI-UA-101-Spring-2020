package qiu.MAIN;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Location implements Serializable{
	private int X;
	private int Y;
	
	public Location(int x, int y) {
		X = x;
		Y = y;
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
	
	public String toString() {
		String location = "[X: " + X + ", Y:" + Y + "]";
		return location;
	}

}
