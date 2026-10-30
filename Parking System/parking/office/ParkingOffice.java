package parking.office;

import parking.core.ParkingZone;

public class ParkingOffice{
	private ParkingZone[] zones;
	private int count;

	public ParkingOffice(){
		this(3);
	}

	public ParkingOffice(int capacity){
		zones = new ParkingZone[capacity];
		count = 0;
	}

	public void addZone(ParkingZone z){
		if(z != null && count < zones.length){
			zones[count] = z;
			count++;
		}
	}

	public ParkingZone getZone(int index){
		if(index >= 0 && index < count){
			return zones[index];
		}
		return null;
	}

	public void printZones(){
		for(int i = 0; i < count; i++){
			System.out.println(i + ": " + zones[i].getLabel());
		}
	}
}
