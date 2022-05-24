package qiu.CARGOSHIPS;

public interface Shiphandling {
	public abstract void navigate(String pos);
	public abstract void dock(String d);
	
	public static final double[] sLength = {100.0,90.0,80.0};
	public static final double[] sBeam = {50.0,45.0,40.0};
	public static final double[] sHeight = {50.0,45.0,40.0};
	public static final String[] sName = {"Starlight","Victoria","Elizabeth"};
	public static final String[] sNationality = {"China","USA","UK"};
	public static final String[] manifest = {"Clothes","Corn","Car","Card","Carpet",
			"Cup","Cap","Carrot","Cabbage","Cable","Coffee Bean","Celery"};
	
	public static final String[] sPos = {"Singapore", "Japan", "Brazil"};
	public static final String[] sDock = {"Port of Singapore", "Port of Tokyo", "Port of Santos"};
	
	
}
