package ParkingLot;
public class ParkingManagerFactory {
	
	public ParkingSpotManager getParkingSpotManager(String vehicle) {
		ParkingSpotManager p = null;
		switch(vehicle) {
		case "twoWheeler": p = TwoWheelerParkingSpotManager.getInstance();
		break;
		
		case "fourWheeler": p = FourWheelerParkingSpotManager.getInstance();
		break;
		
		default: System.out.println("Wrong input");
		}
		
		return p;
	}
	
}
