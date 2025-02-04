package ParkingLot;
import java.util.List;
import java.util.ArrayList;

public abstract class ParkingSpotManager {
	protected List<ParkingSpot>spots;
	
	ParkingSpotManager() {
		this.spots = new ArrayList<>();
	}
	
	public abstract ParkingSpot getParkingSpot(ParkingSpotStratergy s);
	public abstract void addParkingSpots(ParkingSpot spot);
	public abstract void freeParkingSpot(ParkingSpot spot);
	public abstract void fillParkingSpot(ParkingSpot spot);
	
}
