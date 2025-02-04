package ParkingLot;
import java.util.ArrayList;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
	
	private static TwoWheelerParkingSpotManager twoWheelerParkingSpotManager = null;
	
	private TwoWheelerParkingSpotManager() {
		spots = new ArrayList<>();
	}
	
	public static TwoWheelerParkingSpotManager getInstance() {
		if(twoWheelerParkingSpotManager == null) {
			twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager();
		}
		
		return twoWheelerParkingSpotManager;
	}

	@Override
	public ParkingSpot getParkingSpot(ParkingSpotStratergy s) {
		return s.getParkingSpot(spots);
	}

	@Override
	public void freeParkingSpot(ParkingSpot spot) {
		spot.freeSpot();
	}

	@Override
	public void fillParkingSpot(ParkingSpot spot) {
		spot.isOccupied = true;
		
	}

	@Override
	public void addParkingSpots(ParkingSpot spot) {
		spots.add(spot);
	}
	
}
