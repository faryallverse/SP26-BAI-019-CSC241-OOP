package parking.student;

import parking.core.ParkingZone;

public class ReservedStudentPermit extends StudentPermit{
	private int slotNo;

	public ReservedStudentPermit(String plateNo, ParkingZone zone, int d, int m, int y, String dept, int slot){
		super(plateNo, zone, d, m, y, dept);
		this.slotNo = slot;
	}

	public int reservedFee(){
		return studentFee() + 200;
	}

	public void printReserved(){
		printStudent();
		System.out.println("Slot Number: " + slotNo);
	}

	public String verificationCode(){
		int check = (permitId + slotNo) % 10;
		return department + "-" + permitId + "-S" + slotNo + "-" + check;
	}
}