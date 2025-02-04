package ParkingLot;

import java.util.List;

public class FirstAvailableSpotStratergy extends ParkingSpotStratergy {

	@Override
	public ParkingSpot getParkingSpot(List<ParkingSpot> parkingSpotList) {
		for(ParkingSpot parkingSpot: parkingSpotList) {
			if(parkingSpot.getStatus() == false) {
				return parkingSpot;
			}
		}
		return null;
	}
}
