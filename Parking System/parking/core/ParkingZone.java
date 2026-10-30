package parking.core;

public class ParkingZone{
	private String name;
	private int level;

	public ParkingZone(String name){
		this(name, 1);
	}

	public ParkingZone(String name, int level){
		this.name = name;
		this.level = level;
	}

	public String getLabel(){
		return name + "(Level " + level + ")";
	}

	public void setName(String name){
		this.name = name;
	}
}