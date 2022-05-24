package qiu.HOLD;

import qiu.CARGOSHIPS.Shiphandling;
public class CargoHold {
	private String[] items = new String[12];

	public CargoHold() {
		this.items = items;
	}

	public String[] getHold() {
		return items;
	}

	public void setHold(String[] items) {
		this.items = items;
	}
	
	public String[] loadHold(String[] cargo) {
		for (int i = 0; i < 12; i ++)
		{
			items[i] = cargo[i]; 
		}
		return items;
	}
	
	
}
