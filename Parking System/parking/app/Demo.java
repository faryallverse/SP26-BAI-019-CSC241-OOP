package parking.app;

import parking.core.*;
import parking.student.*;
import parking.office.*;
 
public class Demo {
	public static void main(String[] args) {
		ParkingOffice office = new ParkingOffice();  //office: Parking Office: capacity of 3 parking zones (No parameter constructor called)
		ParkingZone shared = new ParkingZone("Block A");  //shared: Parking Zone: Name(Block A): Level(1) (Single parameter-name constructor called)
		office.addZone(shared);  //The parking zone shared (Block A, 1) gets registered in the parking office
		office.addZone(new ParkingZone("Staff", 2));  //Another parking zone is created (Staff, 2) and gets registered in the parking office
		System.out.println("Registered zones:");
		office.printZones();  //Prints the registered zones (Bloack A, 1) and (Staff, 2)
 
		//Creating Parking Permits from the three Permit classes
		ParkingPermit standard = new ParkingPermit("LEA-101", office.getZone(0), 12, 10, 2026);
		StudentPermit student = new StudentPermit("LEB-202", office.getZone(0), 13, 10, 2026, "BCS");
		ReservedStudentPermit reserved = new ReservedStudentPermit("LEC-303", office.getZone(1), 14, 10, 2026, "BCS", 12);
 
		standard.printBasic();  //Prints the standard permit information
 		System.out.println("Fee: Rs. " + standard.standardFee());  //Prints the standard permit fee
		System.out.println("--");
		student.printStudent(); //Prints the student permit information
 		System.out.println("Fee: Rs. " + student.studentFee());  //Prints the student permit fee
		System.out.println("--");
		reserved.printReserved(); //Prints the reserved student permit information
		System.out.println("Fee: Rs. " + reserved.reservedFee());  //Prints the reserved student permit fee
 		System.out.println("Verification: " + reserved.verificationCode());
		System.out.println("--");
		System.out.println("Total permits: "  + ParkingPermit.getIssuedCount());  //Prints the total permits issued
 
		shared.setName("Block B");  //Changing the shared zone's name to Block B from Block A
		System.out.println("After zone rename:");
		standard.printBasic();  //Printing the standard permit information again because it had the shared parking zone
		student.printStudent();  //Printing the student permit information again because it had the shared parking zone
	}
}
