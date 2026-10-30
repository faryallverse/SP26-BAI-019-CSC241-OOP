package parking.core;

public class ParkingPermit{
	private static int nextId = 500;
	protected int permitId;
	private String plateNo;
	private ParkingZone zone;
	private IssueDate issueDate;

	public ParkingPermit(String plateNo, ParkingZone zone, int d, int m, int y){
		nextId++;
		this.permitId = nextId;
		this.plateNo = plateNo;
		this.zone = zone;
		this.issueDate = new IssueDate(d, m, y);
	}

	public int standardFee(){
		return 1000;
	}

	public void printBasic(){
		System.out.println("Permit #" + permitId + " | " + plateNo);
		System.out.println("Assigned Zone: " + zone.getLabel());
		System.out.println("Issue Date: " + issueDate.format());
	}

	public static int getIssuedCount(){
		return nextId - 500;
	}
}