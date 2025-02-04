package ParkingLot;
import java.util.ArrayList;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
	
	private static FourWheelerParkingSpotManager fourWheelerParkingSpotManager = null;
	
	private FourWheelerParkingSpotManager() {
		spots = new ArrayList<ParkingSpot>();
	}
	
	public static FourWheelerParkingSpotManager getInstance() {
		if(fourWheelerParkingSpotManager == null) {
			fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager();
		}
		
		return fourWheelerParkingSpotManager;
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
